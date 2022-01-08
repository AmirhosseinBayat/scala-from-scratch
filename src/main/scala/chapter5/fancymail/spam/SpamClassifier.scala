package fancymail.spam

trait SpamClassifier {
  def isSpam(mailText: String): Boolean
}

object SpamClassifier {
  def wordBased(word: String): SpamClassifier =
    new impl.SimpleSmapClassifier(word)
}

package impl {
  private[spam] class SimpleSmapClassifier(spamWord: String)
      extends SpamClassifier {
    override def isSpam(mailText: String): Boolean =
      mailText.contains(spamWord)
  }
}
