// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lumi/Desktop/18.01/play-wat-vmware-testowy/play-wat-vmware-testowy/conf/routes
// @DATE:Fri Mar 19 07:54:25 CET 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  VMServerController_1: controllers.VMServerController,
  // @LINE:15
  WidgetController_0: controllers.WidgetController,
  // @LINE:19
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    VMServerController_1: controllers.VMServerController,
    // @LINE:15
    WidgetController_0: controllers.WidgetController,
    // @LINE:19
    Assets_2: controllers.Assets
  ) = this(errorHandler, VMServerController_1, WidgetController_0, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, VMServerController_1, WidgetController_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.VMServerController.setCredentials(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listvms""", """controllers.VMServerController.listVMs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """vm""", """controllers.VMServerController.getVMState(vmId:String, name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """startvm/""" + "$" + """vmId<[^/]+>""", """controllers.VMServerController.startVM(vmId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stopvm/""" + "$" + """vmName<[^/]+>""", """controllers.VMServerController.stopVM(vmName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suspendvm/""" + "$" + """vmName<[^/]+>""", """controllers.VMServerController.suspendVM(vmName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetvm/""" + "$" + """vmName<[^/]+>""", """controllers.VMServerController.resetVM(vmName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.listWidgets(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.createWidget(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_VMServerController_setCredentials0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_VMServerController_setCredentials0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      VMServerController_1.setCredentials(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VMServerController",
      "setCredentials",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_VMServerController_listVMs1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listvms")))
  )
  private[this] lazy val controllers_VMServerController_listVMs1_invoker = createInvoker(
    VMServerController_1.listVMs(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VMServerController",
      "listVMs",
      Nil,
      "GET",
      this.prefix + """listvms""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_VMServerController_getVMState2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("vm")))
  )
  private[this] lazy val controllers_VMServerController_getVMState2_invoker = createInvoker(
    VMServerController_1.getVMState(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VMServerController",
      "getVMState",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """vm""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_VMServerController_startVM3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("startvm/"), DynamicPart("vmId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VMServerController_startVM3_invoker = createInvoker(
    VMServerController_1.startVM(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VMServerController",
      "startVM",
      Seq(classOf[String]),
      "GET",
      this.prefix + """startvm/""" + "$" + """vmId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_VMServerController_stopVM4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stopvm/"), DynamicPart("vmName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VMServerController_stopVM4_invoker = createInvoker(
    VMServerController_1.stopVM(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VMServerController",
      "stopVM",
      Seq(classOf[String]),
      "GET",
      this.prefix + """stopvm/""" + "$" + """vmName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_VMServerController_suspendVM5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suspendvm/"), DynamicPart("vmName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VMServerController_suspendVM5_invoker = createInvoker(
    VMServerController_1.suspendVM(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VMServerController",
      "suspendVM",
      Seq(classOf[String]),
      "GET",
      this.prefix + """suspendvm/""" + "$" + """vmName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_VMServerController_resetVM6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetvm/"), DynamicPart("vmName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_VMServerController_resetVM6_invoker = createInvoker(
    VMServerController_1.resetVM(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.VMServerController",
      "resetVM",
      Seq(classOf[String]),
      "GET",
      this.prefix + """resetvm/""" + "$" + """vmName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_WidgetController_listWidgets7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_listWidgets7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WidgetController_0.listWidgets(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "listWidgets",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """widgets""",
      """ Widgets""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_WidgetController_createWidget8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_createWidget8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      WidgetController_0.createWidget(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "createWidget",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """widgets""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_VMServerController_setCredentials0_route(params@_) =>
      call { 
        controllers_VMServerController_setCredentials0_invoker.call(
          req => VMServerController_1.setCredentials(req))
      }
  
    // @LINE:7
    case controllers_VMServerController_listVMs1_route(params@_) =>
      call { 
        controllers_VMServerController_listVMs1_invoker.call(VMServerController_1.listVMs())
      }
  
    // @LINE:8
    case controllers_VMServerController_getVMState2_route(params@_) =>
      call(params.fromQuery[String]("vmId", None), params.fromQuery[String]("name", None)) { (vmId, name) =>
        controllers_VMServerController_getVMState2_invoker.call(VMServerController_1.getVMState(vmId, name))
      }
  
    // @LINE:9
    case controllers_VMServerController_startVM3_route(params@_) =>
      call(params.fromPath[String]("vmId", None)) { (vmId) =>
        controllers_VMServerController_startVM3_invoker.call(VMServerController_1.startVM(vmId))
      }
  
    // @LINE:10
    case controllers_VMServerController_stopVM4_route(params@_) =>
      call(params.fromPath[String]("vmName", None)) { (vmName) =>
        controllers_VMServerController_stopVM4_invoker.call(VMServerController_1.stopVM(vmName))
      }
  
    // @LINE:11
    case controllers_VMServerController_suspendVM5_route(params@_) =>
      call(params.fromPath[String]("vmName", None)) { (vmName) =>
        controllers_VMServerController_suspendVM5_invoker.call(VMServerController_1.suspendVM(vmName))
      }
  
    // @LINE:12
    case controllers_VMServerController_resetVM6_route(params@_) =>
      call(params.fromPath[String]("vmName", None)) { (vmName) =>
        controllers_VMServerController_resetVM6_invoker.call(VMServerController_1.resetVM(vmName))
      }
  
    // @LINE:15
    case controllers_WidgetController_listWidgets7_route(params@_) =>
      call { 
        controllers_WidgetController_listWidgets7_invoker.call(
          req => WidgetController_0.listWidgets(req))
      }
  
    // @LINE:16
    case controllers_WidgetController_createWidget8_route(params@_) =>
      call { 
        controllers_WidgetController_createWidget8_invoker.call(
          req => WidgetController_0.createWidget(req))
      }
  
    // @LINE:19
    case controllers_Assets_versioned9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
