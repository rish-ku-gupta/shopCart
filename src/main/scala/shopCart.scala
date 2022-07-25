package main.scala

class shopCart {
  val appleCost: Double = 0.6
  val orangeCost: Double = 0.25

  def calcBill(checkoutItems: Array[String], includeOffers:Int): Double = {
    var totalBill: Double = 0.0
    val appleCount = checkoutItems.count(_ == "Apple")
    val orangeCount = checkoutItems.count(_ == "Orange")
    if(includeOffers != 1) {
      totalBill = (appleCount * appleCost) + (orangeCount * orangeCost)
    }

    else {
      val appleBill = ((appleCount/2).floor * appleCost) + ((appleCount % 2) * appleCost)
      val orangeBill = (orangeCount/3).floor * 2 * orangeCost + ((orangeCount % 3) * orangeCost)
      totalBill = appleBill + orangeBill
    }
    totalBill
  }
}

object main {
  def main(args: Array[String]): Unit = {
    val shopC = new shopCart()
    val cItems: Array[String] = Array("Apple", "Apple","Orange","Orange","Orange","Orange","Apple")
    val bill: Double = shopC.calcBill(cItems, 1)
    print("Bill = %.2f".format(bill))
  }
}
