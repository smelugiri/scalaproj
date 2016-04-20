
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object movieAdded_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class movieAdded extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Movie,play.twirl.api.HtmlFormat.Appendable] {

  /* movieAdded Template File */
  def apply/*2.2*/(movie: Movie):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.16*/("""

"""),format.raw/*4.1*/("""<h1>Regal Ticket Agency</h1>

<a href="/"> &lt;&lt; Home </a>

<h2> Movie Added Successfully</h2>

 <table border=1>
	  <tr>
	  	<th> Movie Id</th>
	  	<th> Movie Name</th>
	  	<th> Total Seats</th>
	  </tr>
  
	   <tr>
	  	<td>"""),_display_(/*18.10*/movie/*18.15*/.id),format.raw/*18.18*/("""</td>
	  	<td>"""),_display_(/*19.10*/movie/*19.15*/.name),format.raw/*19.20*/("""</td>
	  	<td>"""),_display_(/*20.10*/movie/*20.15*/.totalSeats),format.raw/*20.26*/("""</td>
	  </tr>
  	
  </table>
"""))
      }
    }
  }

  def render(movie:Movie): play.twirl.api.HtmlFormat.Appendable = apply(movie)

  def f:((Movie) => play.twirl.api.HtmlFormat.Appendable) = (movie) => apply(movie)

  def ref: this.type = this

}


}

/* movieAdded Template File */
object movieAdded extends movieAdded_Scope0.movieAdded
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 18:43:24 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/movieAdded.scala.html
                  HASH: 327fe0f6aa75f2694ad5800db955cc6e057feb5d
                  MATRIX: 562->32|671->46|699->48|955->277|969->282|993->285|1035->300|1049->305|1075->310|1117->325|1131->330|1163->341
                  LINES: 20->2|25->2|27->4|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20
                  -- GENERATED --
              */
          