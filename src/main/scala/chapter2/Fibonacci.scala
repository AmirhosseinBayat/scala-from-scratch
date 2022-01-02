import scala.annotation.tailrec
object Fibonacci {
  def fib1(n: Long): Long = {
    var previous = 0L
    var current = 1L
    var result = previous
    var i = 1L
    while (i < n) {
      i += 1
      result = previous + current
      previous = current
      current = result
    }
    result
  }

  def fib2(n: Long): Long = {
    println(s"fib2($n)")
    if (n > 1) fib2(n - 1) + fib2(n - 2)
    else n
  }

  def fib3(n: Long): Long = {
    @tailrec
    def iterate(previous: Long, current: Long, n: Long): Long = {
      println(s"n: $n - prev: $previous - current: $current")
      if (n == 0) current
      else (iterate(current, previous + current, n - 1))
    }
    if (n > 1) iterate(1, 1, n - 2) else n
  }

  def time(f: Long => Long): Long => Long = x => {
    val start = System.nanoTime
    val result = f(x)
    val end = System.nanoTime
    val elapsed = (end - start) / 1000000.0
    println("Elapsed time: " + elapsed + " milliseconds")
    result
  }
}

// exercise 2. page40
object Factorial {
  def factorial(n: Long): Long = {
    @tailrec
    def iterate(result: Long, n: Long): Long = {
      if (n == 1) result
      else (iterate(result * n, n - 1))
    }
    iterate(n, n - 1)
}
}

object Runner extends App {
  println(Factorial.factorial(5))
}
