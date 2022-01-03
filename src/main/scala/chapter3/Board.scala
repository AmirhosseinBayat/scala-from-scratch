final class Board(
    val playerMeeples: Seq[Meeple],
    val opponentMeeples: Seq[Meeple]
) {
  require(
    playerMeeples.nonEmpty,
    "board must have at least 1 player meeple"
  )
  require(
    opponentMeeples.nonEmpty,
    "board must have at least 1 opponent meeple"
  )

  def firstPlayerMeeple: Meeple = playerMeeples.head
  def firstOpponentMeeple: Meeple = opponentMeeples.head

}
