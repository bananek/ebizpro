package daos

import javax.inject.Inject

import models.{Categories, CategoriesREST}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.driver.JdbcProfile
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ExecutionContext, Future}


class CategoriesDAO @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)
  extends HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  val Categories = TableQuery[CategoriesTable]

  def all(implicit ec: ExecutionContext): Future[List[CategoriesREST]] = {
    val query =  Categories
    val results = query.result
    val futureCategories = db.run(results)
    futureCategories.map(
      _.map {
        a => CategoriesREST(genre = a.genre, gid = a.gid)
      }.toList)
  }

  def insert(category: Categories): Future[Unit] = db.run(Categories += category).map { _ => () }


  class CategoriesTable(tag: Tag) extends Table[Categories](tag, "CATEGORIES") {
    def gid = column[Int]("GID",O.AutoInc, O.AutoInc)
    def genre = column[String]("GENRE")
    def * = (gid, genre) <> (models.Categories.tupled, models.Categories.unapply)
  }

}
