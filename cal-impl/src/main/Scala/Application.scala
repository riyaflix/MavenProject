object Application {

  def main(args: Array[String]): Unit =
  {
    val calc = new Calculator()
    println(" ")
    println("This is a simple calculator.")
    println("Given two numbers are 10 and 2.")
    println("Addition: " + calc.+(10, 2))
    println("Subtraction: " + calc.-(10, 2))
    println("Multiplication: " + calc.*(10, 2))
    println("Division: " + calc./(10, 2))

    //println("Division: " + calc./(10, 0))
  }
}
