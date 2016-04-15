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

@Singleton
class PersonController @Inject() (system: ActorSystem)(repo: PersonRepository, val messagesApi: MessagesApi)
                                 (implicit ec: ExecutionContext) extends Controller with I18nSupport{


    implicit val timeout: Timeout = 5.seconds

  /**
   * The mapping for the person form.
   */
  val ticketForm: Form[AddTicketForm] = Form {
    mapping(
      "name" -> nonEmptyText,
      "ticketsCount" -> number.verifying(min(1), max(10)),
      "title" -> nonEmptyText
    )(AddTicketForm.apply)(AddTicketForm.unapply)
  }

  /**
   * The index action.
   */
  def index = Action {
    Ok(views.html.index(ticketForm))
  }


  // Create the 'greeter' actor
  val person2 = system.actorOf(Person2.props(repo,ec), "person2")
  
  val ticket2 = system.actorOf(Props[Ticket2], "ticket2")

  
  /**
   * The add person action.
   *
   * This is asynchronous, since we're invoking the asynchronous methods on PersonRepository.
   */
  def addTicket = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    ticketForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
      errorForm => {
        Future.successful(Ok(views.html.index(errorForm)))
      },
      // There were no errors in the from, so create the person.
      ticket => {
          
          val r = person2 ? Person2.Book(ticket.name, ticket.ticketsCount, ticket.title, ticket2);
          r.mapTo[String].map {
            _ => Redirect(routes.PersonController.index)
            
          
          }(ec)

         // (person2 ? Person2.Book(ticket.name, ticket.title, ticket.ticketsCount)).mapTo[String].map { message => Ok(message) }
          
       
      }
    )
  }

  /**
   * A REST endpoint that gets all the people as JSON.
   */
  def getTickets = Action.async { implicit request =>
  	repo.listTickets().map { tickets =>
      Ok(Json.toJson(tickets))
    }(ec)
  }
}

/**
 * The create person form.
 *
 * Generally for forms, you should define separate objects to your models, since forms very often need to present data
 * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
 * that is generated once it's created.
 */
case class AddTicketForm(name: String, ticketsCount: Int, title: String)
