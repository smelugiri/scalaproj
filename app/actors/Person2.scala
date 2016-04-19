package actors
import akka.actor.{ ActorRef, ActorSystem, Props, Actor, Inbox }
import javax.inject._
import dal._
import models._
import scala.concurrent.{ ExecutionContext, Future }
import akka.util.Timeout
import scala.concurrent.duration._
import akka.pattern.ask
import akka.pattern.pipe
import akka.routing.RoundRobinPool

case object Person2 {
  
   def props(repo: PersonRepository, ec: ExecutionContext): Props = Props(new Person2(repo)(ec) );
  
    case class Book (name: String, ticketsCount: Int, title: String){
        require(name != null, "Nqme cannot be null")
        require(title != null, "Title cannot be null")
        require(ticketsCount > 0, "Valid number of tickets please")
    }
    
    case class Find (id: String){
        require(id != null, "Id cannot be null")
        
    }
    
    case class Cancel (id:String){
        require(id != null, "Id cannot be null")
    }
    
    case object Done
  
    case object Failed
    
}

class Person2 @Inject() (repo: PersonRepository) (implicit ec: ExecutionContext) extends Actor {
	import Person2._
	var balance = BigInt(0)

	implicit val timeout: Timeout = Timeout(5 seconds)

	val ticket2 = context.actorOf(Ticket2.props(repo,ec).withRouter(RoundRobinPool(10)), name = "TicketActors")


	def receive = {

  	case Book(name, ticketsCount, title) =>  {
  
  		ticket2 !Ticket2.Book2(name, ticketsCount, title, self)
  		context.become(ReturnTicket(sender()))
  
  	}
  
  
  	case Find(id) => {  
  		ticket2 ! Ticket2.Find2(id, self)
  		context.become(ReturnFind(sender()))
  	}
  
  
  	case Cancel(id) => {
  		ticket2 ! Ticket2.Cancel2(id)
  		context.become(Return(sender()))
  	}
  
  	case Done => sender ! "Done"
  	
  	case _ => sender ! "Failed"

	}


	def Return(client : ActorRef): Receive = {
  	case Ticket2.Done2 => {
  		client ! "Done"
  		//context.stop(self)
  
  	}

	}

	def ReturnFind(client : ActorRef): Receive = {

  	case x:Ticket2.TicketsList =>{
  		client ! x.tickets
  
  	}

	}

	def ReturnTicket(client:ActorRef):Receive = {
  	case ticket:Ticket2.MyTicket =>{
  		client ! ticket.ticket
  	}
  
  	case _ =>{
  		client ! null
  	}
	}

}