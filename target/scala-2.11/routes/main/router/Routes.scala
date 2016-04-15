
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/conf/routes
// @DATE:Sat Mar 19 20:00:54 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  PersonController_1: controllers.PersonController,
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PersonController_1: controllers.PersonController,
    // @LINE:11
    Assets_0: controllers.Assets
  ) = this(errorHandler, PersonController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PersonController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ticket""", """controllers.PersonController.addTicket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tickets""", """controllers.PersonController.getTickets"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_PersonController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_PersonController_index0_invoker = createInvoker(
    PersonController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PersonController_addTicket1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ticket")))
  )
  private[this] lazy val controllers_PersonController_addTicket1_invoker = createInvoker(
    PersonController_1.addTicket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addTicket",
      Nil,
      "POST",
      """""",
      this.prefix + """ticket"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PersonController_getTickets2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tickets")))
  )
  private[this] lazy val controllers_PersonController_getTickets2_invoker = createInvoker(
    PersonController_1.getTickets,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getTickets",
      Nil,
      "GET",
      """""",
      this.prefix + """tickets"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PersonController_index0_route(params) =>
      call { 
        controllers_PersonController_index0_invoker.call(PersonController_1.index)
      }
  
    // @LINE:7
    case controllers_PersonController_addTicket1_route(params) =>
      call { 
        controllers_PersonController_addTicket1_invoker.call(PersonController_1.addTicket)
      }
  
    // @LINE:8
    case controllers_PersonController_getTickets2_route(params) =>
      call { 
        controllers_PersonController_getTickets2_invoker.call(PersonController_1.getTickets)
      }
  
    // @LINE:11
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_0.versioned(path, file))
      }
  }
}