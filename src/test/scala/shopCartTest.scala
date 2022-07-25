package test.scala
import main.scala.shopCart
import org.scalatest.funsuite.AnyFunSuite

class shopCartTest extends AnyFunSuite  {
  val sc = new shopCart
  test("No Offer - Success Test1") {
    assert(sc.calcBill(Array("Apple","Orange"), 0) === 0.85)
  }

  test("No Offer - Failure Test") {
    assert(sc.calcBill(Array("Apple","Apple","Orange"),0) === 0.85)
  }

  test("No Offer - Success Test2") {
    assert(sc.calcBill(Array("Apple","Apple","Orange"), 0) === 1.45)
  }

  test("With Offer - Success Test") {
    assert(sc.calcBill(Array("Apple","Apple","Orange"),1) === 0.85)
  }

  test("With Offer - Failure Test") {
    assert(sc.calcBill(Array("Apple","Apple","Orange"),1) === 1.45)
  }
}
