

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.api.test._
import play.api.test.Helpers._
import models._
import play.api.libs.json.Json
import play.api.mvc.EssentialAction
import play.api.mvc.Action
import org.specs2.control.Ok
import play.api.mvc.Result
import org.mockito.Mockito
import scala.concurrent.Await
import scala.concurrent.duration._
import javax.inject._
import scala.concurrent.ExecutionContext
import akka.actor.ActorSystem
import akka.actor.Props
import actors.Person2
import dal.PersonRepository
import akka.util._


/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class TicketSpec  @Inject() (system: ActorSystem)(repo: PersonRepository) (implicit ec: ExecutionContext) extends Specification{

  "Application" should {

    
    "render the list all tickets page" in new WithApplication{
      val home = route(FakeRequest(GET, "/tickets")).get

      
      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
    }
  }
  
  
  
  "Application" should {

    "render the book a ticket" in new WithApplication{
      
      val str = """ {"name": "Srikanth", "ticketsCount": "2", "title":"Batman" }"""
      
      val home = route(FakeRequest(GET, "/bookTicket/Srikanth/2/Batman")).get
      
      val x = Await.ready(home, 5.seconds) 
     // val result = call(action, home)
     
      
      
      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
      
    }
    
     "work from within a browser2" in new WithBrowser {

      browser.goTo("http://localhost:" + port+"/tickets")

      browser.pageSource must contain("Batman")
    }
  }
  
  
//  "POST createGroup with JSON" should {
//  "create a group and return a message" in {
//    implicit val app = FakeApplication()
//    running(app) {
//      val fakeRequest = FakeRequest(Helpers.POST, "/ticket", FakeHeaders(), """ {"name": "Srikanth", "ticketsCount": 2, "title":"Batman" } """)
//
//      @Inject var pc: controllers.PersonController = null
//      
//      val cache = collection.mutable.Map[String, String]()
//      
//      val tuplePairs = List(("name", "Srikanth"),("ticketsCount","2"),("title", "Batman"))
//      
//      cache.put("name", "Srikanth")
//      cache.put("ticketsCount","2")
//      cache.put("title", "Batman")
//
//      val immutCache =tuplePairs.toMap
//      
//      val ret =  pc.ticketForm.mapping.bind(immutCache).right
//      
////      val result = pc.addTicket(ret).run  
////      
////      play.api.Logger.info(contentAsString(result))
////      
////      result must not equalTo(null)
////      contentAsString(result) must contain("Batman")
////      status(result) must equalTo(OK)
//      
//      
//      
//      status(ret) must not equalTo(null)
//      
//      //contentType(result) must beSome(AcceptExtractors.Accepts.Json.mimeType)
//     
//      // test the message response
//    }
//  }

//  
//   "work from within a browser3" in new WithBrowser {
//
//      browser.goTo("http://localhost:" + port+"/tickets")
//
//      browser.pageSource must contain("Batman")
//    }

  
  
//  "Ticket" should {
//
//  "be retrieved by id" in {
//    running(FakeApplication()) {
//  
//      val Some(Ticket) = Computer.findById(21)
//
//      macintosh.name must equalTo("Macintosh")
//      macintosh.introduced must beSome.which(dateIs(_, "1984-01-24"))  
//  
//    }
//  }
//}
  
//  "Application" should{
//    "add a movie" in{
//      
//      
//      val person = system.actorOf(Props[Person2], "person2")
//      person ! Person2.Book("Srikanth", 3, "Batman")
//      
//      person ! Person2.Find("1")
//      
//      
//      val result = repo.listMovies().map{
//        movies => for(movie <- movies) yield{
//          if(movie.name == "Batman"){
//            true
//          }
//        }
//      }
//     
//      
//      
//    }
//  }
  
  
  
  
}
