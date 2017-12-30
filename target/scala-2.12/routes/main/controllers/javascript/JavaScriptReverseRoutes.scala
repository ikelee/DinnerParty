
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ikelee/Documents/DinnerParty/conf/routes
// @DATE:Sat Dec 30 11:25:59 EST 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:9
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "asyncStatus"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def status: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.status",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "status"})
        }
      """
    )
  
    // @LINE:7
    def createGame: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createGame",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createGame"})
        }
      """
    )
  
  }


}
