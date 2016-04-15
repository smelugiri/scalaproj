package models

import play.api.libs.json._

case class Ticket(id: Long, name: String, ticketsCount: Int, title: String)

object Ticket {
  
  implicit val ticketFormat = Json.format[Ticket]
}