
// @GENERATOR:play-routes-compiler
// @SOURCE:N:/ebiznes/ec/play/conf/routes
// @DATE:Sat Jul 01 01:38:38 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
