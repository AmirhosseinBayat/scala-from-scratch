object Music {
  val tracks: Seq[Track] = Seq(
    Track(
      SongTitle("Leeds United"),
      Artist("Amanda Palmer"),
      286,
      Seq(Genre("Alternative Rock"))
    ),
    Track(
      SongTitle("The Sweetest Curse"),
      Artist("Baroness"),
      271,
      Seq(Genre("Hard Rock"), Genre("Metal"))
    ),
    Track(
      SongTitle("Blood To Gold"),
      Artist("Boy & Bear"),
      137,
      Seq(Genre("Alternative Rock"))
    ),
    Track(
      SongTitle("Laying Traps"),
      Artist("Crippled Black Phoenix"),
      285,
      Seq(Genre("Rock"))
    ),
    Track(
      SongTitle("Great White Bear"),
      Artist("Dear Reader"),
      240,
      Seq(Genre("Alternative Rock"))
    ),
    Track(
      SongTitle("Angry Planet"),
      Artist("New Model Army"),
      325,
      Seq(Genre("Alternative Rock"))
    ),
    Track(
      SongTitle("Happy Up Here"),
      Artist("Röyksopp"),
      164,
      Seq(Genre("Dance"), Genre("DJ"))
    ),
    Track(SongTitle("Náttmál"), Artist("Solstafir"), 675, Seq(Genre("Metal"))),
    Track(
      SongTitle("Within A Dream"),
      Artist("Tad Morose"),
      246,
      Seq(Genre("Hard Rock"), Genre("Metal"))
    ),
    Track(
      SongTitle("Hey Daydreamer"),
      Artist("Nick Halmstead"),
      204,
      Seq(Genre("Alternative Rock"))
    ),
    Track(
      SongTitle("Oasis"),
      Artist("Amanda Palmer"),
      127,
      Seq(Genre("Alternative Rock"))
    ),
    Track(
      SongTitle("The Legacy"),
      Artist("Iron Maiden"),
      563,
      Seq(Genre("Hard Rock"), Genre("Metal"))
    )
  )

  val palmerTracks = tracks.filter(_.artist.name == "Amanda Palmer")
  val titles = tracks.map(_.title)
  val geners = tracks.flatMap(_.geners)
  val byLength = tracks.sortWith(_.length > _.length)
  val uniqueArtists = tracks.map(_.artist).distinct
  val topTwo = byLength.take(2)
}
