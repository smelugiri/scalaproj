
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[AddTicketForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ticket: Form[AddTicketForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Book Ticket")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
	"""),format.raw/*6.2*/("""<script type='text/javascript' src='"""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("javascripts/index.js")),format.raw/*6.86*/("""'></script>

<h1>Regal Ticket Agency</h1>

<a href="/"> &lt;&lt; Home </a>

	<h2> Book Ticket</h2>
  """),_display_(/*13.4*/form(routes.PersonController.addTicket())/*13.45*/ {_display_(Seq[Any](format.raw/*13.47*/("""
		"""),_display_(/*14.4*/inputText(ticket("name"))),format.raw/*14.29*/("""
		"""),_display_(/*15.4*/inputText(ticket("ticketsCount"))),format.raw/*15.37*/("""
		"""),_display_(/*16.4*/inputText(ticket("title"))),format.raw/*16.30*/("""

		"""),format.raw/*18.3*/("""<div class="buttons">
			<input type="submit" value="Select Ticket"/>
		</div>
	""")))}),format.raw/*21.3*/("""
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(ticket:Form[AddTicketForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(ticket)(messages)

  def f:((Form[AddTicketForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (ticket) => (messages) => apply(ticket)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 18:43:24 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/index.scala.html
                  HASH: 1e40ab710b3bed57f8859aa8a43996d0a6f60115
                  MATRIX: 549->1|717->59|745->78|772->80|799->99|838->101|866->103|929->140|943->146|1004->187|1132->289|1182->330|1222->332|1252->336|1298->361|1328->365|1382->398|1412->402|1459->428|1490->432|1601->513|1633->515
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|36->13|36->13|36->13|37->14|37->14|38->15|38->15|39->16|39->16|41->18|44->21|45->22
                  -- GENERATED --
              */
          