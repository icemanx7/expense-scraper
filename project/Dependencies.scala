import sbt._

object Dependencies {
  lazy val pureConfig = "com.github.pureconfig" %% "pureconfig" % "0.17.4"
  lazy val cats = "org.typelevel" %% "cats-core" % "2.9.0"
  lazy val catsEffect = "org.typelevel" %% "cats-effect" % "3.5.0"
  lazy val sttp = "com.softwaremill.sttp.client3" %% "core" % "3.8.15"
  lazy val scalaTest = "org.scalactic" %% "scalactic" % "3.2.15"
  lazy val scalaTestTest = "org.scalatest" %% "scalatest" % "3.2.15" % "test"
  lazy val scalaMock = "org.scalamock" %% "scalamock" % "5.1.0" % "test"
  lazy val scalaTestMock = "org.scalatest" %% "scalatest" % "3.1.0" % "test"
}
