
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/conf/routes
// @DATE:Tue Apr 19 17:13:15 EDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def findTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.findTicket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "findticket"})
        }
      """
    )
  
    // @LINE:9
    def getTickets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.getTickets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tickets"})
        }
      """
    )
  
    // @LINE:6
    def landing: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.landing",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def addTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addTicket",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ticket"})
        }
      """
    )
  
    // @LINE:12
    def cancelTicket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.cancelTicket",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cancelTicket/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:17
    def addMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addMovie",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addMovie"})
        }
      """
    )
  
    // @LINE:18
    def listMovies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.listMovies",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies"})
        }
      """
    )
  
    // @LINE:14
    def addTicket2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addTicket2",
      """
        function(name,quantity,title) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bookTicket/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("quantity", encodeURIComponent(quantity)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title))})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }


}