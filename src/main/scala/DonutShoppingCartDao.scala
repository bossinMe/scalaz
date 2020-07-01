trait DonutShoppingCartDao[A] {
  //By defining: val donutDatabase: DonutDatabase[A], we are not tying ourselves with any particular storage layer.
  // Instead, the class DonutShoppingCartDao only mandates a type of DonutDatabase[A].
  // Traits which had method signatures. Scala allows traits to also contain method implementations as shown BELOW.

  val donutDatabase: DonutDatabase[A] // dependency injection

  def add(donut: A): Long = {
    println(s"DonutShoppingCartDao-> add method -> donut: $donut")
    donutDatabase.addOrUpdate(donut)
  }

  def update(donut: A): Boolean = {
    println(s"DonutShoppingCartDao-> update method -> donut: $donut")
    donutDatabase.addOrUpdate(donut)
    true
  }

  def search(donut: A): A = {
    println(s"DonutShoppingCartDao-> search method -> donut: $donut")
    donutDatabase.query(donut)
  }

  def delete(donut: A): Boolean = {
    println(s"DonutShoppingCartDao-> delete method -> donut: $donut")
    donutDatabase.delete(donut)
  }

}
