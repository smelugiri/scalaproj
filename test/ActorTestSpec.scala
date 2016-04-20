
import akka.testkit.TestKit
import akka.actor.ActorSystem
import org.specs2.matcher.MustMatchers
import akka.testkit.TestActorRef
import actors.Person2
import akka.testkit.ImplicitSender
import play.api.test.WithApplication
import play.test.WithApplication

class ActorTestSpec extends TestKit(ActorSystem("testSystem"))
with ImplicitSender 
  with MustMatchers{
 
  
  "A Person actor" must {
    // Creation of the TestActorRef
    

    "send back a result" in {

      val actorRef = TestActorRef[Person2]
      
      // This call is synchronous. The actor receive() method will be called in the current thread
      actorRef ! Person2.Book("Srikanth", 3, "Batman")
      // With actorRef.underlyingActor, we can access the SimpleActor instance created by Akka
      
      
      actorRef ! Person2.Cancel("1")
      
      expectMsg(Person2.Done) 
      
      
      }
  }
  
  
}


