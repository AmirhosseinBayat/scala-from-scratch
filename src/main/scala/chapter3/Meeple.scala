abstract class Meeple(val id: Long, val position: Position) {
  final def move(newPosition: Position): Meeple = {
    val requiredSteps = position.steps(newPosition)
    require(isValidStepCount(requiredSteps))
    withNewPosition(newPosition)
  }
  protected def isValidStepCount(steps: Int): Boolean
  protected def withNewPosition(pos: Position): Meeple
}

// exercise 4.page 59
object MountDoom extends Meeple(1L, new Position(10, 5)) {
  override protected def isValidStepCount(steps: Int): Boolean =
    steps > 0 && steps <= 5
  override protected def withNewPosition(pos: Position): Meeple =
    new RegularMeeple(id, pos)
}

final class RegularMeeple(id: Long, position: Position)
    extends Meeple(id, position) {
  override protected def isValidStepCount(steps: Int): Boolean =
    steps > 0 && steps <= 5
  override protected def withNewPosition(pos: Position): Meeple =
    new RegularMeeple(id, pos)
}

// Exercise 2- page 54
final class KingMeeple(id: Long, position: Position)
    extends Meeple(id, position) {
  override protected def isValidStepCount(steps: Int): Boolean =
    steps >= 0 && steps <= 1
  override protected def withNewPosition(pos: Position): Meeple =
    new KingMeeple(id, pos)
}
