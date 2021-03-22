
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

object vmlist extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[models.VMInfo],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vms: Seq[models.VMInfo], server: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

    """),_display_(/*3.6*/main("VMware VM List")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
"""),format.raw/*4.1*/("""<style>
    body"""),format.raw/*5.9*/("""{"""),format.raw/*5.10*/("""
        """),format.raw/*6.9*/("""background-color: #CAFAFE;
    """),format.raw/*7.5*/("""}"""),format.raw/*7.6*/("""
"""),format.raw/*8.1*/("""</style>
<body>


        <div>
            <h2>All Virtual Machines List at  """),_display_(/*13.48*/server),format.raw/*13.54*/(""" """),format.raw/*13.55*/("""HOST</h2>
            <table class="styled-table" style="width: 100%">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*23.18*/for(vm <- vms) yield /*23.32*/ {_display_(Seq[Any](format.raw/*23.34*/("""
                    """),format.raw/*24.21*/("""<tr>
                        <td>"""),_display_(/*25.30*/{
                            vm.getId
                        }),format.raw/*27.26*/("""</td>
                        <td>"""),_display_(/*28.30*/{
                            vm.getName
                        }),format.raw/*30.26*/("""</td>
                        <td><a href=""""),_display_(/*31.39*/controllers/*31.50*/.routes.VMServerController.getVMState(vm.getId, vm.getName)),format.raw/*31.109*/("""">Edit</a></td>
                    </tr>
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</tbody>
            </table>
        </div>
</body>
    """)))}))
      }
    }
  }

  def render(vms:Seq[models.VMInfo],server:String): play.twirl.api.HtmlFormat.Appendable = apply(vms,server)

  def f:((Seq[models.VMInfo],String) => play.twirl.api.HtmlFormat.Appendable) = (vms,server) => apply(vms,server)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-03-19T09:47:53.982
                  SOURCE: C:/Users/Lumi/Desktop/18.01/play-wat-vmware-testowy/play-wat-vmware-testowy/app/views/vmlist.scala.html
                  HASH: f8e7e8e490dbe687b83aed8755161198d6657aac
                  MATRIX: 928->1|1064->42|1098->51|1128->73|1167->75|1195->77|1238->94|1266->95|1302->105|1360->137|1387->138|1415->140|1526->224|1553->230|1582->231|1946->568|1976->582|2016->584|2066->606|2128->641|2215->707|2278->743|2367->811|2439->856|2459->867|2540->926|2632->987|2678->1005
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|38->7|38->7|39->8|44->13|44->13|44->13|54->23|54->23|54->23|55->24|56->25|58->27|59->28|61->30|62->31|62->31|62->31|64->33|65->34
                  -- GENERATED --
              */
          