object Options {
  def map[A, B](opt: Option[A])(f: A => B): Option[B] = {
      opt match {
          case Some(a) => Some(f(a))
          case None => None
      }
  }

  def flatMap[A, B](opt: Option[A])(f: A => Option[B]): Option[B] = {
    opt match {
      case Some(i) => f(i)
      case None => None 
    }
  }

  def filter[A](opt: Option[A])(f: A => Boolean): Option[A] = {
    opt match {
      case None => None
      case Some(x) if f(x) => Some(x)
      case _ => None
    }
  }
}
