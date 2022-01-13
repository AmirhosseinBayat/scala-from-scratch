object DurationSyntax {
  import java.time.Duration
  import scala.concurrent.duration.DAYS
  implicit class ExtendedInt(x: Int) {
    def seconds: Duration = Duration.ofSeconds(x)
    def minutes: Duration = Duration.ofMinutes(x)
  }

  // exercise 1. page152
  implicit class ExtendedDuration(d: Duration) {
    def +(other: Duration): Duration = {
      d + other
    }
  }
}
