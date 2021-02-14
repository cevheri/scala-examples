object First extends App {

  val d = 5
  Console.println("Hello World: " + (args mkString ", "))
  val t: First = new First(7)
  t.printer()

}

class First(c: Int) {
  val a = 5
  val b = 5

  def printer(): Unit = {
    print(a + b + c + First.d)
  }
}
