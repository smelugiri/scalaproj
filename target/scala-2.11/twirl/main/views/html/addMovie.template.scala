
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


  """),_display_(/*9.4*/form(routes.PersonController.addMovie())/*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""
		"""),_display_(/*10.4*/inputText(movie("name"))),format.raw/*10.28*/("""
		"""),_display_(/*11.4*/inputText(movie("totalSeats"))),format.raw/*11.34*/("""

		"""),format.raw/*13.3*/("""<div class="buttons">
			<input type="submit" value="Add Movie"/>
		</div>
	""")))}),format.raw/*16.3*/("""
""")))}),format.raw/*17.2*/("""
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
                  DATE: Tue Apr 19 15:10:52 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/addMovie.scala.html
                  HASH: a768e934c75c91f34248e6986ade3822cf0fd7ba
                  MATRIX: 554->1|720->57|748->76|775->78|800->95|839->97|867->99|930->136|944->142|1005->183|1047->200|1095->240|1134->242|1164->246|1209->270|1239->274|1290->304|1321->308|1428->385|1460->387
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|32->9|32->9|32->9|33->10|33->10|34->11|34->11|36->13|39->16|40->17
                  -- GENERATED --
              */
          