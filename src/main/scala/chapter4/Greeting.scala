object Greeting {
  def greeting(name: String): String = name match {
    case "Daniel" => "Hello Daniel"
    case "Amir"   => "Hello Amir"
    case _        => "Good morning!"
  }

  def preferenceAwareGreeting(person: Person): String = person match {
      case Person(name, "de") => "Guten Morgen, %s!".format(name)
      case Person(name, "en") => "Goden Dag, %s!".format(name)
      case Person(name, _) => "Good morning, %s!".format(name)
  }
}

final case class Person(name: String, preferredLanguage: String)
