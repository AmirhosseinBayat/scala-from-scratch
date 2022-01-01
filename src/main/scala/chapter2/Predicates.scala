object Predicates {
  val isEven: Int => Boolean = _ % 2 == 0
  val areEven: (Int, Int) => Boolean = (x, y) =>
    forBoth(x, y, Predicates.isEven)

  def forBoth(x: Int, y: Int, cond: Int => Boolean): Boolean =
    cond(x) && cond(y)

// Exercises:
// 2. write a function literal with this signature:
  def forInputs(x: Int, y: Int, z: Int, cond: Int => Boolean): Boolean = {
    cond(x) && cond(y) && cond(z)
  }

// 3. write a function with this signature
  def acceptOrElse(x: Int, default: Int, cond: Int => Boolean): Int = {
    if (cond(x)) x else default
  }
}
