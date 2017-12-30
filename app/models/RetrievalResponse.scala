package models

import play.api.libs.json.{Format, Json}

case class RetrievalResponse(
    gameId: String
)

object RetrievalResponse {
  implicit val formatRetrievalEventsResponse: Format[RetrievalResponse] =
    Json.format[RetrievalResponse]
}
