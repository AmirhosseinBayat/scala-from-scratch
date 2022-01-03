class Position(val x: Int, val y: Int) {
  require(x >= 0 && x < 20, "x was %d, expected >=0 && < 20".format(x))
  require(y >= 0 && y < 20, "y was %d, expected >=0 && < 20".format(y))

  def steps(other: Position): Int = {
    Position.assertInRange(10, "String")
    val xDiff = math.abs(other.x - x)
    val yDiff = math.abs(other.y - y)
    xDiff + yDiff

  }

  override def toString: String =
    "%s (x: %d, y: %d)".format(super.toString, x, y)

}

object Position {
  val zero: Position = new Position(0, 0) // exercise 3.page 59
  def apply(x: Int, y: Int): Position = new Position(x, y) // exercise 2.page 59


  private def assertInRange(value: Int, varName: String): Unit =
    require(
      value >= 0 && value < 20,
      "%s was %d, expected it to be >= 0 && < 20".format(varName, value)
    )
}
