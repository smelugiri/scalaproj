package actors
import akka.actor.{ ActorRef, ActorSystem, Props, Actor, Inbox }
import javax.inject.Inject
import dal.PersonRepository
import scala.concurrent.ExecutionContext
import models.Ticket


case object Ticket2 {
  
  def props(repo: PersonRepository, ec: ExecutionContext): Props = Props(new Ticket2(repo)(ec) );
  
  
    case class Book2 (name: String, ticketsCount: Int, title: String, client: ActorRef){}
    
    case class Find2 (id: String, client: ActorRef){}
    
    case class Cancel2 (id:String){}
    
    case class MyTicket(ticket:Ticket)
    
    case class TicketsList(tickets: Seq[Ticket])
    
    case object Done2
    
    case object Failed2
    
}

class Ticket2 @Inject() (repo: PersonRepository) (implicit ec: ExecutionContext) extends Actor {
	import Ticket2._
	var balance = BigInt(0)
	def receive = {

    	case Book2(name, ticketsCount, title, client) => {
    
    		val ticket = repo.addTicket(name, ticketsCount, title)
    				ticket.map{
    			x => {
    				play.api.Logger.info(client.toString() + "++++++++++++++++++")
    				client ! MyTicket(x)
    			}
    		}
    	}
    
    	case Find2(id, client) => {

    		val x = repo.findTicket(id)
    				x.mapTo[Seq[Ticket]].map {
    			tickets => {
    				client ! TicketsList(tickets)
    			}
    		}(ec)

    	}
    
    	case Cancel2(id) =>{
    		repo.cancelTicket(id.toLong)
    		sender ! Done2
    	}
    
    	case Done2 => sender ! "Ticket booked"
    
    	case _ => sender ! "Failed"
	}
}