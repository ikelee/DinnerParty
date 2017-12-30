package services

import com.google.inject.Singleton
import models.RetrievalResponse
import services.InternalServicesError.{GetEventsError, unknownError}

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class GameEventService {
  def createGame(memberId: String)(implicit ec: ExecutionContext)
    : Future[Either[GetEventsError, RetrievalResponse]] = {
    Future(
      Right(
        RetrievalResponse(gameId = scala.util.Random.alphanumeric.take(4).mkString)
      )
    )
  }
}
