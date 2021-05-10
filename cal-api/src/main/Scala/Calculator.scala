class Calculator
  {
    def +(a: Int, b: Int): Int = a+b

    def -(a: Int, b: Int): Int = a-b

    def *(a: Int, b: Int): Long = a*b

    def /(a: Int, b: Int): Int =
    {
      require(b != 0, "denominator can not be 0")
      a/b
    }
  }
