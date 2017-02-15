object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")

    var number = 1 + 1

    println("number => " + number)

    if (number == 2) {
      println("number is 2")
    } else {
      number = number + 1
    }


    for (i <- 1 to 10) {
      print(i + ", ")
    }
    println()

    for (
      i <- 1 to 10
      if i % 2 == 0
    ) {
      print(i + ", ")
    }
    println()


    def abs(x: Int) = if (x >= 0) x else -x

    println("abs:"+abs(-5))


    val fruits = Array("Apple", "Banana", "Orange")

    for (fruit <- fruits) {
      print(fruit + ", ")
    }
    println()

  }
}