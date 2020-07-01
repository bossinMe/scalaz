object DonutStoreApp extends DonutStoreAppController with DonutStoreServices {
  // we create an entry point for our donut application named DonutStoreApp which extends
  // the DonutStoreAppController and injects the required DonutStoreServices as follows:

  def main(args: Array[String]): Unit = {
    DonutStoreApp.booOrder("Vanilla Donut", 10)
  }

}
