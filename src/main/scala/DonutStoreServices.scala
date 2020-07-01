trait DonutStoreServices {
  // define a trait to encapsulate all the services for Donut store

  val donutInventoryServiceFacade = new DonutInventoryServiceFacade[String]
  val donutPricingService = new DonutPricingService[String]
  val donutOrderService = new DonutOrderService[String]
  val donutShoppingCartService = new DonutShoppingCartService(donutInventoryServiceFacade, donutPricingService, donutOrderService)

}
