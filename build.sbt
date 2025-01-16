val scala3Version = "3.6.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "kingdom_builder",
    version := "0.0.1",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"
  )
