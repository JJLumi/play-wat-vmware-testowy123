// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Lumi/Desktop/18.01/play-wat-vmware-testowy/play-wat-vmware-testowy/conf/routes
// @DATE:Fri Mar 19 07:54:25 CET 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseVMServerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def startVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.startVM",
      """
        function(vmId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "startvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmId", vmId0))})
        }
      """
    )
  
    // @LINE:11
    def suspendVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.suspendVM",
      """
        function(vmName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suspendvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmName", vmName0))})
        }
      """
    )
  
    // @LINE:8
    def getVMState: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.getVMState",
      """
        function(vmId0,name1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vm" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("vmId", vmId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name1)])})
        }
      """
    )
  
    // @LINE:12
    def resetVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.resetVM",
      """
        function(vmName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resetvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmName", vmName0))})
        }
      """
    )
  
    // @LINE:6
    def setCredentials: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.setCredentials",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def listVMs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.listVMs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listvms"})
        }
      """
    )
  
    // @LINE:10
    def stopVM: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.VMServerController.stopVM",
      """
        function(vmName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stopvm/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("vmName", vmName0))})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseWidgetController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def createWidget: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.createWidget",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "widgets"})
        }
      """
    )
  
    // @LINE:15
    def listWidgets: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WidgetController.listWidgets",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "widgets"})
        }
      """
    )
  
  }


}
