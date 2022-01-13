import scala.annotation.tailrec

object German {
  @tailrec
  def solangeDieBedingungErfulltIst(
      cond: () => Boolean
  )(exec: () => Unit): Unit =
    if (cond()) {
      exec()
      solangeDieBedingungErfulltIst(cond)(exec)
    }

  def count(start: Int, end: Int): Unit = {
    var i = start
    solangeDieBedingungErfulltIst(() => i <= end) {
      ()
      println(i)
      i = i + 1
      () => i
    }
  }
}
