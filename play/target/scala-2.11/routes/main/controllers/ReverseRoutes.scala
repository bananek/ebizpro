
// @GENERATOR:play-routes-compiler
// @SOURCE:N:/ebiznes/ec/play/conf/routes
// @DATE:Mon Jun 26 23:05:46 CEST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:31
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def product(id:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "product" + queryString(List(if(id == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:12
    def cart(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:9
    def showusers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showusers")
    }
  
    // @LINE:26
    def removetest(t:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "removetest" + queryString(List(if(t == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("t", t)))))
    }
  
    // @LINE:10
    def categories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:18
    def addtocart(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addtocart")
    }
  
    // @LINE:22
    def removefromcart(title:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "removefromcart/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)))
    }
  
    // @LINE:7
    def browse(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "browse")
    }
  
    // @LINE:11
    def category(id:Int = 0): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "category" + queryString(List(if(id == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:14
    def showorders(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showorders")
    }
  
    // @LINE:27
    def newtest(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "newtest")
    }
  
    // @LINE:17
    def sendorder(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sendorder")
    }
  
    // @LINE:25
    def showtest(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showtest")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}