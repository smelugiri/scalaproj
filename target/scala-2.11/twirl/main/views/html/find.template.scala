
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

class find extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[FindTicket],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ticket: Form[FindTicket])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.57*/("""

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

  def render(ticket:Form[FindTicket],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(ticket)(messages)

  def f:((Form[FindTicket]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (ticket) => (messages) => apply(ticket)(messages)

  def ref: this.type = this

}


}

/**/
object find extends find_Scope0.find
              /*
                  -- GENERATED --
                  DATE: Sat Apr 16 14:37:19 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/find.scala.html
                  HASH: 78f0dd214851a9dbdd92ddcb45242da80c5272c9
                  MATRIX: 544->1|709->56|737->75|764->77|793->98|832->100|860->102|923->139|937->145|998->186|1065->227|1115->268|1155->270|1185->274|1231->299|1261->303|1315->336|1345->340|1392->366|1423->370|1534->451|1566->453
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|33->10|33->10|33->10|34->11|34->11|35->12|35->12|36->13|36->13|38->15|41->18|42->19
                  -- GENERATED --
              */
          