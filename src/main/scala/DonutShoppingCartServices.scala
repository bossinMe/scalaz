trait DonutShoppingCartServices[A] extends DonutShoppingCartDao[A] with DonutInventoryService[A]{
  // We made use of the override val keywords.
  override val donutDatabase: DonutDatabase[A] = new CassandraDonutStore[A];
}
