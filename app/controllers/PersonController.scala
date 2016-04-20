package controllers

import play.api._
import play.api.mvc._
import play.api.i18n._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.libs.json.Json
import akka.actor._
import models._
import dal._
import actors._
import akka.util.Timeout
import scala.concurrent.{ ExecutionContext, Future }
import javax.inject._
import akka.pattern.ask
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import scala.concurrent.duration._
import akka.routing.RoundRobinPool
import akka.actor.Status.Success
import akka.actor.Status.Failure
import scala.concurrent.Await


@Singleton
case class PersonController @Inject() (system: ActorSystem)(repo: PersonRepository, val messagesApi: MessagesApi)
                                 (implicit ec: ExecutionContext) extends Controller with I18nSupport{


    implicit val timeout: Timeout = Timeout(5 seconds)

  /**
   * The mapping for the ticket form.
   */
  val ticketForm: Form[AddTicketForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "ticketsCount" -> number.verifying(min(1), max(10)),
      "title" -> nonEmptyText
    )(AddTicketForm.apply)(AddTicketForm.unapply)
  }
    
  /**
   * The mapping for the ticket form.
   */
  val movieForm: Form[AddMovieForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "totalSeats" -> number.verifying(min(1), max(300))
    )(AddMovieForm.apply)(AddMovieForm.unapply)
  }

  /**
   * The index action.
   */
  def index = Action {
    Ok(views.html.index(ticketForm))
  }
  
  val findTicketForm: Form[FindTicketForm] = Form {
    mapping(
      "id" -> nonEmptyText
      
    )(FindTicketForm.apply)(FindTicketForm.unapply)
  }

  def find = Action{
    Ok(views.html.find(findTicketForm))
  }
  
  def landing = Action{
     Ok(views.html.landing.apply())
  }
  
  val person2 = system.actorOf(Person2.props(repo,ec).withRouter(RoundRobinPool(10)), name = "PersonActors")
  
  //val isTerm = person2.isTerminated;
  

  // Create the 'greeter' actor
  //val person2 = system.actorOf(Person2.props(repo,ec), "person2")
  
//  val replicator = DistributedData(context.system).replicator
//  implicit val cluster = Cluster(context.system)
  
  //val ticket2 = system.actorOf(Props[Ticket2].withRouter(RoundRobinPool(10)), name = "TicketActors")

  
  /**
   * The add ticket action.
   *
   * This is asynchronous, since we're invoking the asynchronous methods on PersonRepository.
   */
  def addTicket = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    ticketForm.bindFromRequest.fold(
      
      errorForm => {
        Future.successful(Ok(views.html.index(errorForm)))
      },
      ticket => {
          
          val r = person2 ? Person2.Book(ticket.name, ticket.ticketsCount, ticket.title);
          play.api.Logger.info("Running")
          
          r.mapTo[Ticket].map {

            case x:Ticket => Ok(views.html.confirm.apply(x)) // keep success page here
            
            case _ => Redirect(routes.PersonController.index()) // Keep a failure page here
             
          }(ec)
          
      }
    )
  }
  
  

  /**
   * The add movie action.
   *
   * This is asynchronous, since we're invoking the asynchronous methods on PersonRepository.
   */
  def addMovie = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    movieForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
     errorForm => {
        Future.successful(Ok(views.html.addMovie(movieForm)))
      },
      // There were no errors in the from, so create the person.
      movie => {
          val r = person2 ? Person2.AddMovie(movie.name, movie.totalSeats);
          r.mapTo[Movie].map {

            case x:Movie => Ok(views.html.movieAdded.apply(x)) // keep success page here
            
            case _ => Redirect(routes.PersonController.index()) // Keep a failure page here
             
          }(ec)
          
      }
    )
  }
  
  /**
   * A REST endpoint that gets all the people as JSON.
   */
  def getTickets = Action.async { implicit request =>
  	repo.listTickets().map { 
  	  case tickets: Seq[Ticket] => Ok(views.html.display.apply(tickets.toList))
  	   
  	  case _  => Redirect(routes.PersonController.index())
    }(ec)
  }

  
  /**
   * A REST endpoint that gets all the people as JSON.
   */
  def listMovies = Action.async { implicit request =>
  	repo.listMovies().map { 
  	  case movies: Seq[Movie] => Ok(views.html.listMovies.apply(movies.toList))
  	   
  	  case _  => Redirect(routes.PersonController.index())
    }(ec)
  }

  


/**
   * The add person action.
   *
   * This is asynchronous, since we're invoking the asynchronous methods on PersonRepository.
   */
  def findTicket = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    findTicketForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
      errorForm => {
        Future.successful(Ok(views.html.find(findTicketForm)))
      },
      // There were no errors in the from, so create the person.
      ticket => {
          

        val r = person2 ? Person2.Find(ticket.id);
          play.api.Logger.info(r.value.toString())
          
          r.mapTo[Seq[Ticket]].map {

            case tickets: Seq[Ticket] => {
              
              if(!tickets.isEmpty){
                Ok(views.html.display.apply(tickets.toList))
              }else{
                Ok("<h2> Error </h2> <p> Ticket with given Id is not found <a href='/findticket'> Please try again!!! </a></p> <p><a href='/'> Continue to home page</a> <p> ").as(HTML)
              }
              
            }
            
            case _ => Redirect(routes.PersonController.index()) // Keep a failure page here
             
          }(ec)

      }
    )
  }
  
  
  
  def cancelTicket(id:String) = Action.async { implicit request =>
    
    val r = person2 ? Person2.Cancel(id);
          play.api.Logger.info(r.value.toString())
          
          r.mapTo[String].map {

            case "Done"=> Ok("<h2> Your ticket is cancelled </h2> <p> <a href='/'>Go to home page </a></p> ").as(HTML)
            
            case _ => Redirect(routes.PersonController.index()) // Keep a failure page here
             
          }(ec)
    
  }
  
  
  def addTicket2(name:String, quantity:String, title:String) = Action.async { implicit request =>
    
    val r = person2 ? Person2.Book(name,quantity.toInt,title)
          play.api.Logger.info(r.value.toString())
          
          r.mapTo[Ticket].map {

            case x:Ticket => Ok(views.html.confirm.apply(x)) // keep success page here
            
            case _ => Redirect(routes.PersonController.index()) // Keep a failure page here
             
          }(ec)
    
  }
  
}
/**
 * The create movie/ticket form.
 *
 * Generally for forms, you should define separate objects to your models, since forms very often need to present data
 * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
 * that is generated once it's created.
 */
case class AddTicketForm(name: String, ticketsCount: Int, title: String)
case class FindTicketForm(id:String)
case class AddMovieForm(name: String, totalSeats: Int)


case object PersonController {
  
   def testmethod(){
    
  }
}