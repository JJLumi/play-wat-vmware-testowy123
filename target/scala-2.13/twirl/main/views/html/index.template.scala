
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import play.mvc.Http.Request

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[ConnectionData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(form: Form[ConnectionData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
"""),format.raw/*5.1*/("""<style>
    body"""),format.raw/*6.9*/("""{"""),format.raw/*6.10*/("""
        """),format.raw/*7.9*/("""background-color: #CAFAFE;
    """),format.raw/*8.5*/("""}"""),format.raw/*8.6*/("""
"""),format.raw/*9.1*/("""</style>

<div>

    """),format.raw/*13.40*/("""
    """),_display_(/*14.6*/request/*14.13*/.flash.asScala().data.map/*14.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*14.62*/("""
    """),format.raw/*15.5*/("""<div class=""""),_display_(/*15.18*/name),format.raw/*15.22*/("""">"""),_display_(/*15.25*/value),format.raw/*15.30*/("""</div>
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""<h2>Vmware Connection Details</h2>
    """),format.raw/*18.66*/("""
    """),_display_(/*19.6*/if(form.hasGlobalErrors)/*19.30*/ {_display_(Seq[Any](format.raw/*19.32*/("""
    """),_display_(/*20.6*/form/*20.10*/.globalErrors.asScala.map/*20.35*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*20.84*/("""
    """),format.raw/*21.5*/("""<div>
        """),_display_(/*22.10*/error/*22.15*/.key),format.raw/*22.19*/(""": """),_display_(/*22.22*/error/*22.27*/.message),format.raw/*22.35*/("""
    """),format.raw/*23.5*/("""</div>
    """)))}),format.raw/*24.6*/("""
    """)))}),format.raw/*25.6*/("""

    """),_display_(/*27.6*/helper/*27.12*/.form(routes.VMServerController.setCredentials())/*27.61*/ {_display_(Seq[Any](format.raw/*27.63*/("""
    """),_display_(/*28.6*/helper/*28.12*/.CSRF.formField),format.raw/*28.27*/("""

    """),_display_(/*30.6*/helper/*30.12*/.inputText(form("server"))),format.raw/*30.38*/("""
    """),_display_(/*31.6*/helper/*31.12*/.inputText(form("port"))),format.raw/*31.36*/("""
    """),_display_(/*32.6*/helper/*32.12*/.inputText(form("username"))),format.raw/*32.40*/("""
    """),_display_(/*33.6*/helper/*33.12*/.inputPassword(form("password"))),format.raw/*33.44*/("""

    """),format.raw/*35.5*/("""<button type="submit">Save And Continue</button>
    """)))}),format.raw/*36.6*/("""

"""),format.raw/*38.1*/("""</div>

`                               """)))}),format.raw/*40.34*/("""
"""))
      }
    }
  }

  def render(form:Form[ConnectionData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(form)(request,messages)

  def f:((Form[ConnectionData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (form) => (request,messages) => apply(form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-19T09:57:15.395
                  SOURCE: C:/Users/Lumi/Desktop/18.01/play-wat-vmware-testowy/play-wat-vmware-testowy/app/views/index.scala.html
                  HASH: c82eb7722f0f97dc8d952a9546c61b9bcc25d458
                  MATRIX: 611->1|985->31|1164->117|1191->119|1222->142|1261->144|1288->145|1330->161|1358->162|1393->171|1450->202|1477->203|1504->204|1553->260|1585->266|1601->273|1635->298|1697->322|1729->327|1769->340|1794->344|1824->347|1850->352|1892->364|1924->369|1991->469|2023->475|2056->499|2096->501|2128->507|2141->511|2175->536|2262->585|2294->590|2336->605|2350->610|2375->614|2405->617|2419->622|2448->630|2480->635|2522->647|2558->653|2591->660|2606->666|2664->715|2704->717|2736->723|2751->729|2787->744|2820->751|2835->757|2882->783|2914->789|2929->795|2974->819|3006->825|3021->831|3070->859|3102->865|3117->871|3170->903|3203->909|3287->963|3316->965|3388->1006
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|35->5|36->6|36->6|37->7|38->8|38->8|39->9|43->13|44->14|44->14|44->14|44->14|45->15|45->15|45->15|45->15|45->15|46->16|47->17|48->18|49->19|49->19|49->19|50->20|50->20|50->20|50->20|51->21|52->22|52->22|52->22|52->22|52->22|52->22|53->23|54->24|55->25|57->27|57->27|57->27|57->27|58->28|58->28|58->28|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|65->35|66->36|68->38|70->40
                  -- GENERATED --
              */
          