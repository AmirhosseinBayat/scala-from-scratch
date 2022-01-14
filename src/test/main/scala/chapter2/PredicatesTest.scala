import minitest._

object PredicatesTest extends SimpleTestSuite {
  test("PredicatesTest forBoth") {
    assertEquals(Predicates.forBoth(2, 4, Predicates.isEven), true)
  }
  test("PredicatesTest forInputs") {
    assertEquals(Predicates.forInputs(2, 4, 6, Predicates.isEven), true)
  }
  test("PredicatesTest acceptOrElse") {
    assertEquals(Predicates.acceptOrElse(4, 6, _ % 2 == 0), 4)
  }

}
