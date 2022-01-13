object PolymorphicTime {
  def time[A](f: A => A): A => A = x => {
    val start = System.nanoTime
    val result = f(x)
    val end = System.nanoTime
    val elapsed = (end - start) / 10000000.0
    println("Elapsed time: " + elapsed + " milliseconds")
    result
  } // exercise 1.page 164
  
}
