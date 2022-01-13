import minitest._

object UserRendererTest extends SimpleTestSuite {
  test("Label for user with pronouns contains first name and pronouns") {
    val user = User(1, "Jimmy", "Doe", 25, Some("they/them"))
    assertEquals(UserRenderer.userLabel(user), "Jimmy (they/them)")
  }
  test("Label for user without pronouns contains first and last name") {
    val user = User(1, "Jane", "Doe", 31, None)
    assertEquals(UserRenderer.userLabel(user), "Jane Doe")
  }

  test("firstName returns N/A if optUser is empty") {
    assertEquals(UserRenderer.firstName(None), "N/A")
  }
}
