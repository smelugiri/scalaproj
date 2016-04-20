package actors
import akka.actor.{ ActorRef, ActorSystem, Props, Actor, Inbox }
import javax.inject.Inject
import dal.PersonRepository
import scala.concurrent.ExecutionContext
import models._
import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy._
import org.h2.message.DbException
import akka.actor.ActorKilledException
import akka.dispatch.RequiresMessageQueue
import akka.dispatch.BoundedMessageQueueSemantics


case object Ticket2 {
  
  def props(repo: PersonRepository, ec: ExecutionContext): Props = Props(new Ticket2(repo)(ec) );
  
  
    case class AddMovie(name:String, totalSeats:Int, client:ActorRef){} 
  
    case class Book2 (name: String, ticketsCount: Int, title: String, client: ActorRef){}
    
    case class Find2 (id: String, client: ActorRef){}
    
    case class Cancel2 (id:String){}
    
    case class MyTicket(ticket:Ticket)
    
    case class MyMovie(movie:Movie)
    
    case class TicketsList(tickets: Seq[Ticket])
    
    case object Done2
    
    case object Failed2
    
}

class Ticket2 @Inject() (repo: PersonRepository) (implicit ec: ExecutionContext) extends Actor with RequiresMessageQueue[BoundedMessageQueueSemantics]{
	import Ticket2._
	var balance = BigInt(0)
	
		override val supervisorStrategy = OneForOneStrategy (){
	  case x: DbException => Restart
	  case y: ActorKilledException => Stop
	  case _: Exception => Escalate
	  
	}
	
	def receive = {

	  
	    case AddMovie(name, totalSeats, client) =>{
	      play.api.Logger.info(name + "======= "+totalSeats)
	      val movie = repo.addMovie(name, totalSeats)
    				movie.map{
    			x => {
    			  play.api.Logger.info("retrn ovee")
    				client ! MyMovie(x)
    			}
    		}
	      
	    }
	    
    	case Book2(name, ticketsCount, title, client) => {
    
    		val ticket = repo.addTicket(name, ticketsCount, title)
    				ticket.map{
    			x => {
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