
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object find_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class find extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[FindTicketForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ticket: Form[FindTicketForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Find Ticket")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
	"""),format.raw/*6.2*/("""<script type='text/javascript' src='"""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("javascripts/index.js")),format.raw/*6.86*/("""'></script>

<h1>Regal Ticket Agency</h1>

<a href="/"> &lt;&lt; Home </a>

<h2> Enter the Ticket Id from your reservation</h2>

  """),_display_(/*14.4*/form(routes.PersonController.findTicket())/*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
		"""),_display_(/*15.4*/inputText(ticket("id"))),format.raw/*15.27*/("""
		

		"""),format.raw/*18.3*/("""<div class="buttons">
			<input type="submit" value="Find Ticket"/>
		</div>
	""")))}),format.raw/*21.3*/("""
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(ticket:Form[FindTicketForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(ticket)(messages)

  def f:((Form[FindTicketForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (ticket) => (messages) => apply(ticket)(messages)

  def ref: this.type = this

}


}

/**/
object find extends find_Scope0.find
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 18:43:24 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/find.scala.html
                  HASH: ddcfc8c91adaad1324c019c0eb37e4df7b4cbe3b
                  MATRIX: 548->1|717->60|745->79|772->81|799->100|838->102|866->104|929->141|943->147|1004->188|1162->320|1213->362|1253->364|1283->368|1327->391|1361->398|1470->477|1502->479
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|37->14|37->14|37->14|38->15|38->15|41->18|44->21|45->22
                  -- GENERATED --
              */
          