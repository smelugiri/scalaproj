
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
"""),_display_(/*5.2*/main("Ticket Agency")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
	"""),format.raw/*6.2*/("""<script type='text/javascript' src='"""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("javascripts/index.js")),format.raw/*6.86*/("""'></script>

	<ul id="tickets"></ul>

  """),_display_(/*10.4*/form(routes.PersonController.findTicket())/*10.46*/ {_display_(Seq[Any](format.raw/*10.48*/("""
		"""),_display_(/*11.4*/inputText(ticket("id"))),format.raw/*11.27*/("""
		

		"""),format.raw/*14.3*/("""<div class="buttons">
			<input type="submit" value="Select Ticket"/>
		</div>
	""")))}),format.raw/*17.3*/("""
""")))}),format.raw/*18.2*/("""
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
                  DATE: Sun Apr 17 21:16:26 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/find.scala.html
                  HASH: 36bcaf716c9739694ea8849d33a4b8e41df1a8c4
                  MATRIX: 548->1|717->60|745->79|772->81|801->102|840->104|868->106|931->143|945->149|1006->190|1073->231|1124->273|1164->275|1194->279|1238->302|1272->309|1383->390|1415->392
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|33->10|33->10|33->10|34->11|34->11|37->14|40->17|41->18
                  -- GENERATED --
              */
          