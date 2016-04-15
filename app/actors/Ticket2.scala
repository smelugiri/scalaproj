package actors
import akka.actor.{ ActorRef, ActorSystem, Props, Actor, Inbox }


case object Ticket2 {
    case class Book2 (quantity:Int){
        require(quantity > 0)
    }
    
    case class Cancel2 (quantity:Int){
        require(quantity > 0)
    }
    
    case object Done2
    case object Failed2
    
}

class Ticket2 extends Actor {
    import Ticket2._
    var balance = BigInt(0)
    def receive = {
        case Book2(quantity) => balance += quantity
                                sender ! Done2
        case Cancel2(quantity) if quantity <= balance => balance -= quantity
                                                        sender ! Done2
                                                        
        case Done2 => sender ! "Ticket booked"
        case _ => sender ! "Failed"
    }
}