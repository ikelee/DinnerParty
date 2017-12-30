
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ikelee/Documents/DinnerParty/conf/routes
// @DATE:Sat Dec 30 11:25:59 EST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  AsyncController_1: controllers.AsyncController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    AsyncController_1: controllers.AsyncController
  ) = this(errorHandler, HomeController_0, AsyncController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, AsyncController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """status""", """controllers.HomeController.status"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createGame""", """controllers.HomeController.createGame"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """asyncStatus""", """controllers.AsyncController.message"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_status0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("status")))
  )
  private[this] lazy val controllers_HomeController_status0_invoker = createInvoker(
    HomeController_0.status,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "status",
      Nil,
      "GET",
      this.prefix + """status""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_createGame1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createGame")))
  )
  private[this] lazy val controllers_HomeController_createGame1_invoker = createInvoker(
    HomeController_0.createGame,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createGame",
      Nil,
      "GET",
      this.prefix + """createGame""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("asyncStatus")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_1.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """asyncStatus""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_status0_route(params@_) =>
      call { 
        controllers_HomeController_status0_invoker.call(HomeController_0.status)
      }
  
    // @LINE:7
    case controllers_HomeController_createGame1_route(params@_) =>
      call { 
        controllers_HomeController_createGame1_invoker.call(HomeController_0.createGame)
      }
  
    // @LINE:9
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_1.message)
      }
  }
}
