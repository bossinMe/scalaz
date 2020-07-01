class DonutPricingService[T] {
  def calculatePrice(donut: T): Double = {
    println("DonutPricingService->calculatePrice")
    2.50
  }

}
