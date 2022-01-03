object ReallySimpleMoveRecommender extends MoveRecommender {
   override def recommendMove(board: Board): Move = new Move(
       meepldId = board.firstPlayerMeeple.id,
       newPosition = new Position(0,0)
   )
}