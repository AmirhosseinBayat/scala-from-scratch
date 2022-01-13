import minitest._

object OptionsTest extends SimpleTestSuite {
    // exercise 1. page 197
    test("Test Options with Some()") {
        val mapOptions = Options.map(Some("Amir"))(_.length)
        assertEquals(mapOptions, Some(4))
    }
    test("Test None on Optoins") {
        val noneOptoins = Options.map(None)((None) => ())
        assertEquals(noneOptoins, None)
    }

    test("Test flatMap Options") {
        val flatMapOption = Options.flatMap(Some(Some("amir")))(_.map(_.length))
        assertEquals(flatMapOption, Some(4))
    }

    test("Test filter Options - condition not right") {
        val filterOption = Options.filter(Some("Ali"))(_.length > 4)
        assertEquals(filterOption, None)
    }

    test("Test filter Options - condition is right") {
        val filterOption = Options.filter(Some("Ali"))(_.length >1)
        assertEquals(filterOption, Some("Ali"))
    }
}