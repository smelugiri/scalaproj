
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


 """),format.raw/*5.2*/("""<table border=1>
	  <tr>
	  	<th> Movie Id</th>
	  	<th> Movie Name</th>
	  	<th> Total Seats</th>
	  	<th> Action </th>
	  </tr>
  
	   <tr>
	  	<td>"""),_display_(/*14.10*/movie/*14.15*/.id),format.raw/*14.18*/("""</td>
	  	<td>"""),_display_(/*15.10*/movie/*15.15*/.name),format.raw/*15.20*/("""</td>
	  	<td>"""),_display_(/*16.10*/movie/*16.15*/.totalSeats),format.raw/*16.26*/("""</td>
	  	<td><a href="/cancelTicket/"""),_display_(/*17.33*/movie/*17.38*/.id),format.raw/*17.41*/(""""> Cancel ticket(s)</a></td>
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
                  DATE: Tue Apr 19 14:52:38 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/movieAdded.scala.html
                  HASH: e6425f1ee0635d4009e9dc5465a9b7ef2e0f682a
                  MATRIX: 562->32|671->46|701->50|879->201|893->206|917->209|959->224|973->229|999->234|1041->249|1055->254|1087->265|1152->303|1166->308|1190->311
                  LINES: 20->2|25->2|28->5|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17
                  -- GENERATED --
              */
          