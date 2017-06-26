
// @GENERATOR:play-routes-compiler
// @SOURCE:N:/ebiznes/ec/play/conf/routes
// @DATE:Mon Jun 26 23:05:46 CEST 2017


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
