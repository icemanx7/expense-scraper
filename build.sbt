import Dependencies._

ThisBuild / scalaVersion := "2.13.10"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "rt.solution"
ThisBuild / organizationName := "solution"

lazy val root = (project in file("."))
  .settings(
    name := "expense-scraper",
    libraryDependencies += pureConfig,
    libraryDependencies += cats,
    libraryDependencies += catsEffect,
    libraryDependencies += sttp,
    libraryDependencies += catsEffectPureConfig,
    libraryDependencies += newType,
    libraryDependencies += sttpCats,
    libraryDependencies ++= circe,
    libraryDependencies += scalaTest,
    libraryDependencies += scalaTestTest,
    libraryDependencies += scalaMock,
    libraryDependencies += scalaTestMock
  )

scalacOptions ++= Seq( // use ++= to add to existing options
  "-Ymacro-annotations"
)
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
