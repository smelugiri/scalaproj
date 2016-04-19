
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* error Template File */
  def apply/*2.2*/(error: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.17*/("""


"""),format.raw/*5.1*/("""<h3> Error </h3>

<p> """),_display_(/*7.6*/error),format.raw/*7.11*/(""" """),format.raw/*7.12*/("""</p>"""))
      }
    }
  }

  def render(error:String): play.twirl.api.HtmlFormat.Appendable = apply(error)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (error) => apply(error)

  def ref: this.type = this

}


}

/* error Template File */
object error extends error_Scope0.error
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 10:21:08 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/error.scala.html
                  HASH: 9d9cb2a013c3d0444ad327a0dd9fd74c8f73437b
                  MATRIX: 548->27|658->42|687->45|735->68|760->73|788->74
                  LINES: 20->2|25->2|28->5|30->7|30->7|30->7
                  -- GENERATED --
              */
          