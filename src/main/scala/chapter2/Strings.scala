object Strings {
  def pluralise(singular: String, n: Int): String = {
      val text = if(n > 1) singular + "s" else singular
      "%d %s".format(n, text)
  }
}
