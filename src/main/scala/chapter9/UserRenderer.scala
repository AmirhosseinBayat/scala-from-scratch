object UserRenderer {
  def userLabel(user: User): String = user.pronouns match {
    case Some(pronouns) => s"${user.firstName} ($pronouns)"
    case None           => s"${user.firstName} ${user.lastName}"
  }

  def firstName(optUser: Option[User]): String = optUser match {
    case Some(user) => user.firstName
    case None       => "N/A"
  }
}
