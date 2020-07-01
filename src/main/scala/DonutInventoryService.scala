trait DonutInventoryService[A] {
  // This trait which will be responsible to checking donut inventory.
  val donutDatabase: DonutDatabase[A] // dependency injection

  def checkStockQuantity(donut: A): Int = {
    println(s"DonutInventoryService-> checkStockQuantity method -> donut: $donut")
    donutDatabase.query(donut)
    1
  }
}
