class DonutInventoryServiceFacade[T] {
  // DonutInventoryService which will encapsulate methods to check for Donut inventory.
  // Instead of a class, we could have used a trait. We are keeping this example simple and will make use of traits for the main facade.
  def checkStock(donut: T): Boolean = {
    println("DonutInventoryService->checkStock")
    true
  }

}
