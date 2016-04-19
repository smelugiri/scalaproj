
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



"""),format.raw/*6.1*/("""<h1>Welcome</h1>

 <table border=1>
	  <tr>
	  	<th> Ticket Id</th>
	  	<th> Movie Name</th>
	  	<th> Person</th>
	  	<th> Quantity</th>
	  	<th> Action </th>
	  </tr>
  

"""),_display_(/*18.2*/for(ticket <- tickets) yield /*18.24*/ {_display_(Seq[Any](format.raw/*18.26*/("""
  
 
	   """),format.raw/*21.5*/("""<tr>
	  	<td>"""),_display_(/*22.10*/ticket/*22.16*/.id),format.raw/*22.19*/("""</td>
	  	<td>"""),_display_(/*23.10*/ticket/*23.16*/.title),format.raw/*23.22*/("""</td>
	  	<td>"""),_display_(/*24.10*/ticket/*24.16*/.name),format.raw/*24.21*/("""</td>
	  	<td>"""),_display_(/*25.10*/ticket/*25.16*/.ticketsCount),format.raw/*25.29*/("""</td>
	  	<td><a href="/cancelTicket/"""),_display_(/*26.33*/ticket/*26.39*/.id),format.raw/*26.42*/(""""> Cancel ticket(s)</a></td>
	  </tr>
  	
""")))}),format.raw/*29.2*/("""

  """),format.raw/*31.3*/("""</table>
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
                  DATE: Mon Apr 18 22:09:12 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/display.scala.html
                  HASH: f464fd62a485fa0ba889c696970f3f0cd23def5c
                  MATRIX: 561->30|679->53|709->57|908->230|946->252|986->254|1023->264|1064->278|1079->284|1103->287|1145->302|1160->308|1187->314|1229->329|1244->335|1270->340|1312->355|1327->361|1361->374|1426->412|1441->418|1465->421|1538->464|1569->468
                  LINES: 20->2|25->2|29->6|41->18|41->18|41->18|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|52->29|54->31
                  -- GENERATED --
              */
          