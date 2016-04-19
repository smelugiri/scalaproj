package models

import play.api.libs.json._

case class Movie(id: Long, name: String, totalSeats: Int)

object Movie {
  
  implicit val movieFormat = Json.format[Movie]
}