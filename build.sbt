ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

Keys.libraryDependencies += "io.jsonwebtoken" % "jjwt" % "0.9.1"
lazy val root = (project in file("."))
  .settings(
    name := "Cstudy"

  )
