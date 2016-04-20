
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object confirm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class confirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Ticket,play.twirl.api.HtmlFormat.Appendable] {

  /* confirm Template File */
  def apply/*2.2*/(ticket: Ticket):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.18*/("""

"""),format.raw/*4.1*/("""<h1>Regal Ticket Agency</h1>

<a href="/"> &lt;&lt; Home </a>

<h2> Your ticket has been booked</h2>

 <table border=1>
	  <tr>
	  	<th> Ticket Id</th>
	  	<th> Movie Name</th>
	  	<th> Person</th>
	  	<th> Quantity</th>
	  	<th> Action </th>
	  </tr>
  
	   <tr>
	  	<td>"""),_display_(/*20.10*/ticket/*20.16*/.id),format.raw/*20.19*/("""</td>
	  	<td>"""),_display_(/*21.10*/ticket/*21.16*/.title),format.raw/*21.22*/("""</td>
	  	<td>"""),_display_(/*22.10*/ticket/*22.16*/.name),format.raw/*22.21*/("""</td>
	  	<td>"""),_display_(/*23.10*/ticket/*23.16*/.ticketsCount),format.raw/*23.29*/("""</td>
	  	<td><a href="/cancelTicket/"""),_display_(/*24.33*/ticket/*24.39*/.id),format.raw/*24.42*/(""""> Cancel ticket(s)</a></td>
	  </tr>
  	
  </table>
"""))
      }
    }
  }

  def render(ticket:Ticket): play.twirl.api.HtmlFormat.Appendable = apply(ticket)

  def f:((Ticket) => play.twirl.api.HtmlFormat.Appendable) = (ticket) => apply(ticket)

  def ref: this.type = this

}


}

/* confirm Template File */
object confirm extends confirm_Scope0.confirm
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 18:43:24 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/confirm.scala.html
                  HASH: 2a00cf754f31857bbfb1d9ababfe3dcea342c453
                  MATRIX: 554->29|665->45|693->47|993->320|1008->326|1032->329|1074->344|1089->350|1116->356|1158->371|1173->377|1199->382|1241->397|1256->403|1290->416|1355->454|1370->460|1394->463
                  LINES: 20->2|25->2|27->4|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24
                  -- GENERATED --
              */
          