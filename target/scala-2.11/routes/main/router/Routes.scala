
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/conf/routes
// @DATE:Tue Apr 19 15:43:32 EDT 2016

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
  // @LINE:19
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PersonController_1: controllers.PersonController,
    // @LINE:19
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """findticket""", """controllers.PersonController.findTicket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelTicket/$id<[^/]+>""", """controllers.PersonController.cancelTicket(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookTicket/$name<[^/]+>/$quantity<[^/]+>/$title<[^/]+>""", """controllers.PersonController.addTicket2(name:String, quantity:String, title:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addMovie""", """controllers.PersonController.addMovie"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies""", """controllers.PersonController.listMovies"""),
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

  // @LINE:9
  private[this] lazy val controllers_PersonController_findTicket3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("findticket")))
  )
  private[this] lazy val controllers_PersonController_findTicket3_invoker = createInvoker(
    PersonController_1.findTicket,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "findTicket",
      Nil,
      "GET",
      """""",
      this.prefix + """findticket"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_PersonController_cancelTicket4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelTicket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonController_cancelTicket4_invoker = createInvoker(
    PersonController_1.cancelTicket(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "cancelTicket",
      Seq(classOf[String]),
      "GET",
      """GET     /displayticket				controllers.PersonController.displayTicket""",
      this.prefix + """cancelTicket/$id<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_PersonController_addTicket25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookTicket/"), DynamicPart("name", """[^/]+""",true), StaticPart("/"), DynamicPart("quantity", """[^/]+""",true), StaticPart("/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PersonController_addTicket25_invoker = createInvoker(
    PersonController_1.addTicket2(fakeValue[String], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addTicket2",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """bookTicket/$name<[^/]+>/$quantity<[^/]+>/$title<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_PersonController_addMovie6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addMovie")))
  )
  private[this] lazy val controllers_PersonController_addMovie6_invoker = createInvoker(
    PersonController_1.addMovie,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addMovie",
      Nil,
      "GET",
      """""",
      this.prefix + """addMovie"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PersonController_listMovies7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies")))
  )
  private[this] lazy val controllers_PersonController_listMovies7_invoker = createInvoker(
    PersonController_1.listMovies,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "listMovies",
      Nil,
      "GET",
      """""",
      this.prefix + """movies"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
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
  
    // @LINE:9
    case controllers_PersonController_findTicket3_route(params) =>
      call { 
        controllers_PersonController_findTicket3_invoker.call(PersonController_1.findTicket)
      }
  
    // @LINE:11
    case controllers_PersonController_cancelTicket4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_PersonController_cancelTicket4_invoker.call(PersonController_1.cancelTicket(id))
      }
  
    // @LINE:13
    case controllers_PersonController_addTicket25_route(params) =>
      call(params.fromPath[String]("name", None), params.fromPath[String]("quantity", None), params.fromPath[String]("title", None)) { (name, quantity, title) =>
        controllers_PersonController_addTicket25_invoker.call(PersonController_1.addTicket2(name, quantity, title))
      }
  
    // @LINE:16
    case controllers_PersonController_addMovie6_route(params) =>
      call { 
        controllers_PersonController_addMovie6_invoker.call(PersonController_1.addMovie)
      }
  
    // @LINE:17
    case controllers_PersonController_listMovies7_route(params) =>
      call { 
        controllers_PersonController_listMovies7_invoker.call(PersonController_1.listMovies)
      }
  
    // @LINE:19
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_0.versioned(path, file))
      }
  }
}