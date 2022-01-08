case class SongTitle(value: String) extends AnyVal

// exercise 2.page 146
final class Length private (val l: Int) extends AnyVal

object Length {
  def apply(l: Int): Length = {
    require(l > 1, "length could not be lower than 1")
    new Length(l)
  }
}
