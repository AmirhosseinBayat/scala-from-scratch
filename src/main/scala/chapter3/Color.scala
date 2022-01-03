class Color(val red: Int, val green: Int, val blue: Int) {
  require(red >= 0 && red < 256)
  require(green >= 0 && green < 256)
  require(blue >= 0 && blue < 256)
}

object Color {
  def apply(red: Int, green: Int, blue: Int): Color =
    new Color(red, green, blue)

  val White: Color = new Color(255, 255, 255)
  val Black: Color = new Color(0, 0, 0)
  val Red: Color = new Color(255, 0, 0)
  val Green: Color = new Color(0, 255, 0)
  val Blue: Color = new Color(0, 0, 255)
}
