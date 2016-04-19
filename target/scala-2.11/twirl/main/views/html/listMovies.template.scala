
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listMovies_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class listMovies extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Movie],play.twirl.api.HtmlFormat.Appendable] {

  /* listMovies Template File */
  def apply/*3.2*/(movies: List[Movie]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.23*/("""



"""),format.raw/*7.1*/("""<h1>Welcome</h1>

 <table border=1>
	  <tr>
	  	<th> Movie Id</th>
	  	<th> Movie Name</th>
	  	<th> Total Seats</th>
	  </tr>
  

"""),_display_(/*17.2*/for(movie <- movies) yield /*17.22*/ {_display_(Seq[Any](format.raw/*17.24*/("""
  
 
	   """),format.raw/*20.5*/("""<tr>
	  	<td>"""),_display_(/*21.10*/movie/*21.15*/.id),format.raw/*21.18*/("""</td>
	  	<td>"""),_display_(/*22.10*/movie/*22.15*/.name),format.raw/*22.20*/("""</td>
	  	<td>"""),_display_(/*23.10*/movie/*23.15*/.totalSeats),format.raw/*23.26*/("""</td>
	  	
	  </tr>
  	
""")))}),format.raw/*27.2*/("""

  """),format.raw/*29.3*/("""</table>
"""))
      }
    }
  }

  def render(movies:List[Movie]): play.twirl.api.HtmlFormat.Appendable = apply(movies)

  def f:((List[Movie]) => play.twirl.api.HtmlFormat.Appendable) = (movies) => apply(movies)

  def ref: this.type = this

}


}

/* listMovies Template File */
object listMovies extends listMovies_Scope0.listMovies
              /*
                  -- GENERATED --
                  DATE: Tue Apr 19 15:46:09 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/listMovies.scala.html
                  HASH: 53ac551c22c874b2111606c45211d618c6ae20fb
                  MATRIX: 568->33|684->54|714->58|872->190|908->210|948->212|985->222|1026->236|1040->241|1064->244|1106->259|1120->264|1146->269|1188->284|1202->289|1234->300|1289->325|1320->329
                  LINES: 20->3|25->3|29->7|39->17|39->17|39->17|42->20|43->21|43->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|49->27|51->29
                  -- GENERATED --
              */
          