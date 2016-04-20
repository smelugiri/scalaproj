
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object landing_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class landing extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* landing Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""



"""),format.raw/*6.1*/("""<h1>Regal Ticket Agency</h1>

<ul>
	<li><a href="/home">Book a Ticket</a> </li>
	<li><a href="/findticket"> Find your ticket</a> </li>
	<li><a href="/tickets">List all tickets</a> </li>
	<li> <a href="/addMovie">Add Movie</a> </li>
	<li> <a href="/movies">List Movies </a> </li>
</ul>
"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/* landing Template File */
object landing extends landing_Scope0.landing
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 18:43:51 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/landing.scala.html
                  HASH: fd7e1f3ce37802661c7fc0a5e6627b726eb40dca
                  MATRIX: 551->29|658->41|688->45
                  LINES: 20->2|25->2|29->6
                  -- GENERATED --
              */
          