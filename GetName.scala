object GetName {
  def nameInput(): String = {
    println("Please enter a summoner name: ")
    val input = scala.io.StdIn.readLine()
    val name = input.matches("^[0-9\\p{L} _\\.]+$")
    if(name) {
      return input
    }
    println("Invalid summoner name.")
    return nameInput()
  }

  def main(args: Array[String]) {
    println(nameInput())
  }
}
