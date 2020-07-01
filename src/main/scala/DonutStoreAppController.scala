trait DonutStoreAppController {
  // How to define a facade to expose functionality of DonutStoreServices
  //We can now create a facade named DonutStoreAppController which will expose the functionality for DonutStoreServices defined in the previous
  this: DonutStoreServices =>

  def booOrder(donut: String, quantity: Int): Int = {
  println("DonutStoreAppController->bookOrder")
    donutShoppingCartService.bookOrder(donut, quantity)
  }
}
