class DonutOrderService[T] {

  // DonutOrderService which will be responsible for saving a donut order to some underlying database.
  def createOrder(donut: T, quantity: Int, price: Double): Int = {
    println(s"Saving donut order to database: donut = $donut, quantity = $quantity, price = $price")
    100 // the id of the booked order
  }

}
