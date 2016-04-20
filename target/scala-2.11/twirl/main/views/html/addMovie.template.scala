
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addMovie_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class addMovie extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[AddMovieForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(movie: Form[AddMovieForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Movie")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
	"""),format.raw/*6.2*/("""<script type='text/javascript' src='"""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("javascripts/index.js")),format.raw/*6.86*/("""'></script>

<h1>Regal Ticket Agency</h1>

<a href="/"> &lt;&lt; Home </a>

<h2> Add Movie</h2>

  """),_display_(/*14.4*/form(routes.PersonController.addMovie())/*14.44*/ {_display_(Seq[Any](format.raw/*14.46*/("""
		"""),_display_(/*15.4*/inputText(movie("name"))),format.raw/*15.28*/("""
		"""),_display_(/*16.4*/inputText(movie("totalSeats"))),format.raw/*16.34*/("""

		"""),format.raw/*18.3*/("""<div class="buttons">
			<input type="submit" value="Add Movie"/>
		</div>
	""")))}),format.raw/*21.3*/("""
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(movie:Form[AddMovieForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(movie)(messages)

  def f:((Form[AddMovieForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (movie) => (messages) => apply(movie)(messages)

  def ref: this.type = this

}


}

/**/
object addMovie extends addMovie_Scope0.addMovie
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 18:43:24 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/addMovie.scala.html
                  HASH: 26696a36582ad74e99d274648ab6a3e676de55ea
                  MATRIX: 554->1|720->57|748->76|775->78|800->95|839->97|867->99|930->136|944->142|1005->183|1131->283|1180->323|1220->325|1250->329|1295->353|1325->357|1376->387|1407->391|1514->468|1546->470
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|37->14|37->14|37->14|38->15|38->15|39->16|39->16|41->18|44->21|45->22
                  -- GENERATED --
              */
          