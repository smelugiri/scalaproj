
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


 """),format.raw/*5.2*/("""<table border=1>
	  <tr>
	  	<th> Ticket Id</th>
	  	<th> Movie Name</th>
	  	<th> Person</th>
	  	<th> Quantity</th>
	  	<th> Action </th>
	  </tr>
  
	   <tr>
	  	<td>"""),_display_(/*15.10*/ticket/*15.16*/.id),format.raw/*15.19*/("""</td>
	  	<td>"""),_display_(/*16.10*/ticket/*16.16*/.title),format.raw/*16.22*/("""</td>
	  	<td>"""),_display_(/*17.10*/ticket/*17.16*/.name),format.raw/*17.21*/("""</td>
	  	<td>"""),_display_(/*18.10*/ticket/*18.16*/.ticketsCount),format.raw/*18.29*/("""</td>
	  	<td><a href="/cancelTicket/"""),_display_(/*19.33*/ticket/*19.39*/.id),format.raw/*19.42*/(""""> Cancel ticket(s)</a></td>
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
                  DATE: Mon Apr 18 20:54:30 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/confirm.scala.html
                  HASH: cfd50c3ac1bd941f4a77f9d2f6a5db9db7eb568a
                  MATRIX: 554->29|665->45|695->49|892->219|907->225|931->228|973->243|988->249|1015->255|1057->270|1072->276|1098->281|1140->296|1155->302|1189->315|1254->353|1269->359|1293->362
                  LINES: 20->2|25->2|28->5|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19
                  -- GENERATED --
              */
          