package guessinggame.shell

import minitest.SimpleTestSuite

import scala.io.Source
import scala.util.Using

object Application extends SimpleTestSuite {
  test("Running the appliation") {
    val stream = new CapturingPrintStream
    val messagePrinter = new MessagePrinter(stream.out)
    val inputReader: InputReader = _ => "42"
    val randomGenerator = () => 42
    val application =
      new Application(messagePrinter, inputReader, randomGenerator)

    application.run()

    val expectedOutput = Using(
      Source
        .fromURL(getClass.getResource("expected-output.txt"))
    ) { source => source.getLines().mkString("\n") }

    assertEquals(stream.capturedOutput, expectedOutput)
  }
}
