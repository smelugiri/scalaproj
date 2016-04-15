
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
"""),_display_(/*5.2*/main("Ticket Agency")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
	"""),format.raw/*6.2*/("""<script type='text/javascript' src='"""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("javascripts/index.js")),format.raw/*6.86*/("""'></script>

	<ul id="persons"></ul>

  """),_display_(/*10.4*/form(routes.PersonController.addTicket())/*10.45*/ {_display_(Seq[Any](format.raw/*10.47*/("""
		"""),_display_(/*11.4*/inputText(ticket("name"))),format.raw/*11.29*/("""
		"""),_display_(/*12.4*/inputText(ticket("ticketsCount"))),format.raw/*12.37*/("""
		"""),_display_(/*13.4*/inputText(ticket("title"))),format.raw/*13.30*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Select Ticket"/>
		</div>
	""")))}),format.raw/*18.3*/("""
""")))}),format.raw/*19.2*/("""
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
                  DATE: Sat Mar 19 20:03:34 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/index.scala.html
                  HASH: 79dc053e29be6847861fb8a99ba65f07d1024bfd
                  MATRIX: 549->1|717->59|745->78|772->80|801->101|840->103|868->105|931->142|945->148|1006->189|1073->230|1123->271|1163->273|1193->277|1239->302|1269->306|1323->339|1353->343|1400->369|1431->373|1542->454|1574->456
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|33->10|33->10|33->10|34->11|34->11|35->12|35->12|36->13|36->13|38->15|41->18|42->19
                  -- GENERATED --
              */
          