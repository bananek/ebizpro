
// @GENERATOR:play-routes-compiler
// @SOURCE:N:/ebiznes/ec/play/conf/routes
// @DATE:Mon Jun 26 23:05:46 CEST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """@controllers.Application@.index"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """browse""", """@controllers.Application@.browse"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product""", """@controllers.Application@.product(id:Int ?= 0)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showusers""", """@controllers.Application@.showusers"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """categories""", """@controllers.Application@.categories"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """category""", """@controllers.Application@.category(id:Int ?= 0)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cart""", """@controllers.Application@.cart"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showorders""", """@controllers.Application@.showorders"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """sendorder""", """@controllers.Application@.sendorder"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addtocart""", """@controllers.Application@.addtocart"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """removefromcart/$title<[^/]+>""", """@controllers.Application@.removefromcart(title:String)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showtest""", """@controllers.Application@.showtest"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """removetest""", """@controllers.Application@.removetest(t:Int ?= 0)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newtest""", """@controllers.Application@.newtest"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_browse1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("browse")))
  )
  private[this] lazy val controllers_Application_browse1_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).browse,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "browse",
      Nil,
      "GET",
      """""",
      this.prefix + """browse"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_product2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product")))
  )
  private[this] lazy val controllers_Application_product2_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).product(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "product",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """product"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_showusers3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showusers")))
  )
  private[this] lazy val controllers_Application_showusers3_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).showusers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showusers",
      Nil,
      "GET",
      """""",
      this.prefix + """showusers"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_categories4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_Application_categories4_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).categories,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "categories",
      Nil,
      "GET",
      """""",
      this.prefix + """categories"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_category5_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_Application_category5_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).category(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "category",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """category"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_cart6_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Application_cart6_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).cart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "cart",
      Nil,
      "GET",
      """""",
      this.prefix + """cart"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_showorders7_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showorders")))
  )
  private[this] lazy val controllers_Application_showorders7_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).showorders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showorders",
      Nil,
      "GET",
      """GET     /createproduct              @controllers.Application.createproduct""",
      this.prefix + """showorders"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_sendorder8_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendorder")))
  )
  private[this] lazy val controllers_Application_sendorder8_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).sendorder,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "sendorder",
      Nil,
      "POST",
      """POST    /newproduct                 @controllers.Application.newproduct""",
      this.prefix + """sendorder"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_addtocart9_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addtocart")))
  )
  private[this] lazy val controllers_Application_addtocart9_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).addtocart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addtocart",
      Nil,
      "POST",
      """""",
      this.prefix + """addtocart"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_removefromcart10_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removefromcart/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_removefromcart10_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).removefromcart(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removefromcart",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """removefromcart/$title<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_showtest11_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showtest")))
  )
  private[this] lazy val controllers_Application_showtest11_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).showtest,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showtest",
      Nil,
      "GET",
      """""",
      this.prefix + """showtest"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_removetest12_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removetest")))
  )
  private[this] lazy val controllers_Application_removetest12_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).removetest(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "removetest",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """removetest"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_newtest13_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newtest")))
  )
  private[this] lazy val controllers_Application_newtest13_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).newtest,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newtest",
      Nil,
      "POST",
      """""",
      this.prefix + """newtest"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Assets_at14_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).index)
      }
  
    // @LINE:7
    case controllers_Application_browse1_route(params) =>
      call { 
        controllers_Application_browse1_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).browse)
      }
  
    // @LINE:8
    case controllers_Application_product2_route(params) =>
      call(params.fromQuery[Int]("id", Some(0))) { (id) =>
        controllers_Application_product2_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).product(id))
      }
  
    // @LINE:9
    case controllers_Application_showusers3_route(params) =>
      call { 
        controllers_Application_showusers3_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).showusers)
      }
  
    // @LINE:10
    case controllers_Application_categories4_route(params) =>
      call { 
        controllers_Application_categories4_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).categories)
      }
  
    // @LINE:11
    case controllers_Application_category5_route(params) =>
      call(params.fromQuery[Int]("id", Some(0))) { (id) =>
        controllers_Application_category5_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).category(id))
      }
  
    // @LINE:12
    case controllers_Application_cart6_route(params) =>
      call { 
        controllers_Application_cart6_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).cart)
      }
  
    // @LINE:14
    case controllers_Application_showorders7_route(params) =>
      call { 
        controllers_Application_showorders7_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).showorders)
      }
  
    // @LINE:17
    case controllers_Application_sendorder8_route(params) =>
      call { 
        controllers_Application_sendorder8_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).sendorder)
      }
  
    // @LINE:18
    case controllers_Application_addtocart9_route(params) =>
      call { 
        controllers_Application_addtocart9_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).addtocart)
      }
  
    // @LINE:22
    case controllers_Application_removefromcart10_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_Application_removefromcart10_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).removefromcart(title))
      }
  
    // @LINE:25
    case controllers_Application_showtest11_route(params) =>
      call { 
        controllers_Application_showtest11_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).showtest)
      }
  
    // @LINE:26
    case controllers_Application_removetest12_route(params) =>
      call(params.fromQuery[Int]("t", Some(0))) { (t) =>
        controllers_Application_removetest12_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).removetest(t))
      }
  
    // @LINE:27
    case controllers_Application_newtest13_route(params) =>
      call { 
        controllers_Application_newtest13_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.Application]).newtest)
      }
  
    // @LINE:31
    case controllers_Assets_at14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(controllers.Assets.at(path, file))
      }
  }
}