package daos

/**
  * Created by BanaN on 6/17/2017.
  */

import javax.inject.Inject

import models.{Order, OrderREST}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{ExecutionContext, Future}

import javax.inject.Inject
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider
import slick.driver.JdbcProfile


class OrderDAO @Inject()(protected val dbConfigProvider: DatabaseConfigProvider)
  extends HasDatabaseConfigProvider[JdbcProfile] {

  import driver.api._

  val Orders = TableQuery[OrderTable]

  def insert(order: Order): Future[Unit] = db.run(Orders += order).map { _ => () }

  def remove(oid: Int): Future[Unit] = db.run(Orders.filter(_.oid === oid).delete).map { _ => () }

  def all(implicit ec: ExecutionContext): Future[List[OrderREST]] = {
    val query =  Orders
    val results = query.result
    val futureProducts = db.run(results)
    futureProducts.map(
      _.map {
        a => OrderREST(oid = a.oid, productlist = a.productlist, shipment = a.shipment, payment = a.payment, price = a.price, uid = a.uid, address = a.address)
      }.toList)
  }

  class OrderTable(tag: Tag) extends Table[Order](tag, "ORDER") {

    def oid = column[Int]("OID",O.AutoInc, O.AutoInc)

    def productlist = column[String]("PRODUCTLIST")

    def shipment = column[String]("SHIPMENT")

    def payment = column[String]("PAYMENT")

    def price = column[Int]("PRICE")

    def uid = column[String]("UID")

    def address = column[String]("ADDRESS")

    def * = (oid, productlist, shipment, payment, price, uid, address) <> (models.Order.tupled, models.Order.unapply)
  }

}
