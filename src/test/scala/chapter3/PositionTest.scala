import minitest._

object PositionTest extends SimpleTestSuite {
  test("Cannot create position with x < 0") {
    intercept[java.lang.IllegalArgumentException] { new Position(-1, 0) }
    ()
  }
  test("Cannot create position with y < 0") {
    intercept[java.lang.IllegalArgumentException] { new Position(0, -1) }
    ()
  }
  test("Cannot create position with x >= 20") {
    intercept[java.lang.IllegalArgumentException] { new Position(20, 0) }
    ()
  }
  test("Cannot create position with y >= 20") {
    intercept[java.lang.IllegalArgumentException] { new Position(0, 20) }
    ()
  }

  test("step from (0,0) to (10, 5) == 15") {
      val pos1 = new Position(0, 0)
      val pos2 = new Position(10, 5)
      assertEquals(pos1.steps(pos2), 15)
  }
  test("step from (7,3) to (0, 0) == 10") {
      val pos1 = new Position(7, 3)
      val pos2 = new Position(0, 0)
      assertEquals(pos1.steps(pos2), 10)
  }
}
