package test.scala
import main.scala.shopCart
import org.scalatest.funsuite.AnyFunSuite

class shopCartTest extends AnyFunSuite  {
  val sc = new shopCart
  test("shopCart.calcBill") {
    assert(sc.calcBill(Array("Apple","Orange")) === 0.85)
  }
}
