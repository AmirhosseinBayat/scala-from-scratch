object IsEven extends Function1[Int, Boolean] {
  override def apply(v1: Int): Boolean = v1 % 2 == 0
} // it's what syntactic sugar compiles to => val isEven: (Int) => Boolean = (x) => x %2 == 0

// implement Function1 through anonymous class like java implementation
object maintainer {
  val isEven = new Function1[Int, Boolean] {
    override def apply(x: Int): Boolean = x % 2 == 0
  }
}
