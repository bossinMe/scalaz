class DonutShoppingCartService[T] (
  donutInventoryServiceFacade: DonutInventoryServiceFacade[T],
  donutPricingService: DonutPricingService[T],
  donutOrderService: DonutOrderService[T]) {

  // DonutShoppingCartService class which requires a DonutInventoryService, a DonutPricingService and a DonutOrderService.
  // It provides a method called bookOrder(...) which will check for donut inventory.
  // If we have that donut in stock, it will then calculate the price for the donut and finally save an order to some underlying database

  def bookOrder(donut: T, quantity: Int): Int = {
    println("DonutShoppingCartService->bookOrder")

    donutInventoryServiceFacade.checkStock(donut) match {
      case true =>
        val price = donutPricingService.calculatePrice(donut)
        donutOrderService.createOrder(donut, quantity, price) // the id of the booked order

      case false =>
        println(s"Sorry donut $donut is out of stock!")
        -100 // return some error code to identify out of stock
    }


  }
}