import minitest._

object StringTest extends SimpleTestSuite {
    test("pluralise one comment") {
        assertEquals(Strings.pluralise("new comment", 1), "1 new comment")
    }

    test("pluralise two comment") {
        assertEquals(Strings.pluralise("new comment", 2), "2 new comments")
    }
}