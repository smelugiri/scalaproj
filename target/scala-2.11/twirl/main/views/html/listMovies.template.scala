
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



"""),format.raw/*7.1*/("""<h1>Regal Ticket Agency</h1>

<a href="/"> &lt;&lt; Home </a>

<h2> Movies Showing </h2>
 <table border=1>
	  <tr>
	  	<th> Movie Id</th>
	  	<th> Movie Name</th>
	  	<th> Total Seats</th>
	  </tr>
  

"""),_display_(/*20.2*/for(movie <- movies) yield /*20.22*/ {_display_(Seq[Any](format.raw/*20.24*/("""
  
 
	   """),format.raw/*23.5*/("""<tr>
	  	<td>"""),_display_(/*24.10*/movie/*24.15*/.id),format.raw/*24.18*/("""</td>
	  	<td>"""),_display_(/*25.10*/movie/*25.15*/.name),format.raw/*25.20*/("""</td>
	  	<td>"""),_display_(/*26.10*/movie/*26.15*/.totalSeats),format.raw/*26.26*/("""</td>
	  	
	  </tr>
  	
""")))}),format.raw/*30.2*/("""

  """),format.raw/*32.3*/("""</table>
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
                  DATE: Tue Apr 19 18:43:24 EDT 2016
                  SOURCE: /Users/srikanthmelugiri/play-scala-intro-reactive-platform-15v09/app/views/listMovies.scala.html
                  HASH: d967bb217258d5ee0ce6a35640e5df1ea981615b
                  MATRIX: 568->33|684->54|714->58|943->261|979->281|1019->283|1056->293|1097->307|1111->312|1135->315|1177->330|1191->335|1217->340|1259->355|1273->360|1305->371|1360->396|1391->400
                  LINES: 20->3|25->3|29->7|42->20|42->20|42->20|45->23|46->24|46->24|46->24|47->25|47->25|47->25|48->26|48->26|48->26|52->30|54->32
                  -- GENERATED --
              */
          