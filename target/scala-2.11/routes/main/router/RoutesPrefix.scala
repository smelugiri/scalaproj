
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/conf/routes
// @DATE:Sat Mar 19 20:00:54 EDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
