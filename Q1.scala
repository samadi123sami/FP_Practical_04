package prac04_22001816
import scala.io.StdIn
object Q1 {

  val item = Array("soap", "yogurt", "books", "pen", "pencil", "eraser")
  val quantity = Array(16, 28, 10, 33, 19, 40)

  def displayinventory(): Unit = {
    println("List of the inventory items names and quantity:")
    for (i <- item.indices) {
      println(item(i) + " " + quantity(i))
    }
  }

  def restockitem(name: String, quant: Int): Unit = {
    var count = 0
    for (i <- item.indices) {
      if (item(i) == name) {
        quantity(i) = quantity(i) + quant
        count += 1
      }
    }

    if (count == 0) {
      println("Your item is not available in our store.")
    }

    println("Now available items and quantities are: ")
    for (i <- item.indices) {
      println(item(i) + " " + quantity(i))
    }
  }

  def sellitem(name: String, quant: Int): Unit = {
    var count = 0
    for (i <- item.indices) {
      if (item(i) == name) {
        if (quantity(i) >= quant) {
          quantity(i) = quantity(i) - quant
          count += 1
        } else {
          println(s"Not enough quantity of $name available to sell.")
          return
        }
      }
    }

    if (count == 0) {
      println("Your item is not available in our store.")
    }

    println("Now available items and quantities are: ")
    for (i <- item.indices) {
      println(item(i) + " " + quantity(i))
    }
  }

  def main(args: Array[String]): Unit = {
    displayinventory()

    println("How many different items do you want to buy?")
    val itemsToBuy = StdIn.readLine().toInt

    for (k <- 0 until itemsToBuy) {
      println("Enter the item which you want to buy: ")
      val itemName = StdIn.readLine()

      println("Enter the quantity of this item which you want to buy: ")
      val quantityToBuy = StdIn.readLine().toInt
      restockitem(itemName, quantityToBuy)
    }

    println("How many different items do you want to sell?")
    val itemsToSell = StdIn.readLine().toInt

    for (k <- 0 until itemsToSell) {
      println("Enter the item which you want to sell: ")
      val itemName = StdIn.readLine()

      println("Enter the quantity of this item which you want to sell: ")
      val quantityToSell = StdIn.readLine().toInt
      sellitem(itemName, quantityToSell)
    }
  }
}
