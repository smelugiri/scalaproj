
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object display_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class display extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Ticket],play.twirl.api.HtmlFormat.Appendable] {

  /* display2 Template File */
  def apply/*2.2*/(tickets: List[Ticket]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.25*/("""



"""),format.raw/*6.1*/("""<h1>Regal Ticket Agency</h1>

<a href="/"> &lt;&lt; Home </a>
<h3>All tickets booked so far</h3>

 <table border=1>
	  <tr>
	  	<th> Ticket Id</th>
	  	<th> Movie Name</th>
	  	<th> Person</th>
	  	<th> Quantity</th>
	  	<th> Action </th>
	  </tr>
  
  """),_display_(/*20.4*/if(tickets.size > 0)/*20.24*/{_display_(Seq[Any](format.raw/*20.25*/("""
  	

"""),_display_(/*23.2*/for(ticket <- tickets) yield /*23.24*/ {_display_(Seq[Any](format.raw/*23.26*/("""
  
 
	   """),format.raw/*26.5*/("""<tr>
	  	<td>"""),_display_(/*27.10*/ticket/*27.16*/.id),format.raw/*27.19*/("""</td>
	  	<td>"""),_display_(/*28.10*/ticket/*28.16*/.title),format.raw/*28.22*/("""</td>
	  	<td>"""),_display_(/*29.10*/ticket/*29.16*/.name),format.raw/*29.21*/("""</td>
	  	<td>"""),_display_(/*30.10*/ticket/*30.16*/.ticketsCount),format.raw/*30.29*/("""</td>
	  	<td><a href="/cancelTicket/"""),_display_(/*31.33*/ticket/*31.39*/.id),format.raw/*31.42*/(""""> Cancel ticket(s)</a></td>
	  </tr>
  	
""")))}),format.raw/*34.2*/("""
""")))}/*35.2*/else/*35.6*/{_display_(Seq[Any](format.raw/*35.7*/("""
	 """),format.raw/*36.3*/("""<tr><td colspan =5 align="center">No tickets have been booked so far</td></tr>
""")))}),format.raw/*37.2*/("""

  """),format.raw/*39.3*/("""</table>

  """))
      }
    }
  }

  def render(tickets:List[Ticket]): play.twirl.api.HtmlFormat.Appendable = apply(tickets)

  def f:((List[Ticket]) => play.twirl.api.HtmlFormat.Appendable) = (tickets) => apply(tickets)

  def ref: this.type = this

}


}

/* display2 Template File */
object display extends display_Scope0.display
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 18:35:41 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/display.scala.html
                  HASH: 25eda3dca42f5beea40d734e249370b8fd2c7d5c
                  MATRIX: 561->30|679->53|709->57|989->311|1018->331|1057->332|1090->339|1128->361|1168->363|1205->373|1246->387|1261->393|1285->396|1327->411|1342->417|1369->423|1411->438|1426->444|1452->449|1494->464|1509->470|1543->483|1608->521|1623->527|1647->530|1720->573|1740->575|1752->579|1790->580|1820->583|1930->663|1961->667
                  LINES: 20->2|25->2|29->6|43->20|43->20|43->20|46->23|46->23|46->23|49->26|50->27|50->27|50->27|51->28|51->28|51->28|52->29|52->29|52->29|53->30|53->30|53->30|54->31|54->31|54->31|57->34|58->35|58->35|58->35|59->36|60->37|62->39
                  -- GENERATED --
              */
          