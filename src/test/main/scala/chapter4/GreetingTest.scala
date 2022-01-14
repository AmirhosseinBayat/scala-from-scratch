import minitest._

object GreetingTest extends SimpleTestSuite {
    test("Daniel is greeted in German") {
        assertEquals(Greeting.greeting("Daniel"), "Hello Daniel")
    }

    test("Unknown people get greeted in English") {
        assertEquals(Greeting.greeting("Anna"), "Good morning!")
    }
}