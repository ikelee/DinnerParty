package controllers

import javax.inject._

import models.RetrievalResponse
import play.api.libs.json.Json
import play.api.mvc._
import services.GameEventService
import services.InternalServicesError.GetEventsError

import scala.concurrent.ExecutionContext.Implicits.global

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents, eventService: GameEventService) extends AbstractController(cc) {

  def status = Action {
    Ok("Hi")
  }
  def createGame: Action[AnyContent] = Action.async { implicit request =>
    val memberId = request.getQueryString("memberId").map(_.toString).getOrElse("")
    eventService
      .createGame(memberId = "35")
      .map(toHttpResults)
  }

  private def toHttpResults(response: Either[GetEventsError, RetrievalResponse]): Result =
    response match {
      case Right(eventsResponse) => Ok(Json.toJson(eventsResponse))
      case _                     => InternalServerError(ControllerError.UnknownServerError)
    }
}
