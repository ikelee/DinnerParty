
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ikelee/Documents/DinnerParty/conf/routes
// @DATE:Sat Dec 30 11:25:59 EST 2017


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
