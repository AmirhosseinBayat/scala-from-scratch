final case class Resource(content: String)
object Resource {
  def resourceFromConfigDirectory: Option[Resource] = None
  def resourceFromClasspath: Option[Resource] = Some(
    Resource("classpath resource")
  )
  def resource: Option[Resource] = resourceFromConfigDirectory match {
    case Some(res) => resourceFromConfigDirectory
    case None      => resourceFromClasspath
  }
}
