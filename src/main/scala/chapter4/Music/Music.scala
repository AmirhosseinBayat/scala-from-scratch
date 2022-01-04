object Music {
  val tracks: Seq[Track] = Seq(
    Track("Leeds United", "Amanda Palmer", 286, Seq("Alternative Rock")),
    Track("The Sweetest Curse", "Baroness", 271, Seq("Hard Rock", "Metal")),
    Track("Blood To Gold", "Boy & Bear", 137, Seq("Alternative Rock")),
    Track("Laying Traps", "Crippled Black Phoenix", 285, Seq("Rock")),
    Track("Great White Bear", "Dear Reader", 240, Seq("Alternative Rock")),
    Track("Angry Planet", "New Model Army", 325, Seq("Alternative Rock")),
    Track("Happy Up Here", "Röyksopp", 164, Seq("Dance", "DJ")),
    Track("Náttmál", "Solstafir", 675, Seq("Metal")),
    Track("Within A Dream", "Tad Morose", 246, Seq("Hard Rock", "Metal")),
    Track("Hey Daydreamer", "Nick Halmstead", 204, Seq("Alternative Rock")),
    Track("Oasis", "Amanda Palmer", 127, Seq("Alternative Rock")),
    Track("The Legacy", "Iron Maiden", 563, Seq("Hard Rock", "Metal"))
  )

  val palmerTracks = tracks.filter(_.artist == "Amanda Palmer")
  val titles = tracks.map(_.title)
  val geners = tracks.flatMap(_.geners) 
  val byLength = tracks.sortWith(_.length > _.length)
  val uniqueArtists = tracks.map(_.artist).distinct
  val topTwo = byLength.take(2)
}