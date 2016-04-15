package actors
import akka.actor.{ ActorRef, ActorSystem, Props, Actor, Inbox }
import javax.inject._
import dal._
import models._
import scala.concurrent.{ ExecutionContext, Future }


case object Person2 {
  
   def props(repo: PersonRepository, ec: ExecutionContext): Props = Props(new Person2(repo)(ec) );
  
    case class Book (name: String, ticketsCount: Int, title: String, ticket2:ActorRef){
        require(name != null, "Nqme cannot be null")
        require(title != null, "Title cannot be null")
        require(ticketsCount > 0, "Valid number of tickets please")
    }
    
    case class Cancel (quantity:Int){
        require(quantity > 0, "Number of tickets to cancel")
    }
    
    case object Done
    case object Failed
    
}

class Person2 @Inject() (repo: PersonRepository) (implicit ec: ExecutionContext) extends Actor {
    import Person2._
    var balance = BigInt(0)
    
    
    def receive = {
        case Book(name, ticketsCount, title, ticket2) => ticket2 ! Ticket2.Book2(ticketsCount) // should send to ticket2 not sender()
                                            context.become(bookTicket(name, ticketsCount, title, sender))
        //case Cancel(ticket) => sender ! Ticket2.Cancel2(ticket.ticketsCount)
                                            //context.become(bookTicket(name, ticketsCount, title, sender))
        case _ => sender ! Failed
    }
    
    def bookTicket(name: String, ticketsCount: Int, title: String, client: ActorRef): Receive = {
        case Ticket2.Done2 => {
        
                 repo.addTicket(name, ticketsCount, title).map { _ =>
                  // If successful, we simply redirect to the index page.
                  //Redirect(routes.PersonController.index)
                }
        
            client ! "Done"
            context.stop(self)
        }
        case Ticket2.Failed2 =>
            client ! Failed
            context.stop(self)
    }
}