package guessinggame.shell

import java.io.{ByteArrayOutputStream, PrintStream}

final class CapturingPrintStream {
  private val byteStream = new ByteArrayOutputStream
  val out: PrintStream = new PrintStream(byteStream)

  def capturedOutput: String = byteStream.toString
}
