name := "demo"
organization := "localhost"

scalaVersion := "2.12.4"

libraryDependencies += guice

lazy val commonSettings = Seq(
  version := "testing",
  logLevel := Level.Debug,
  scalacOptions ++= Seq("-deprecation", "-explaintypes", "-unchecked", "-feature"),
  showSuccess := true,
  showTiming := true,
  logBuffered := false,
  fork := true,
  parallelExecution := true
)

// Main module
lazy val demo = project.in(file("."))
  .enablePlugins(PlayJava)
  .configs(IntegrationTest)
  .settings(commonSettings)

// Play framework
PlayKeys.externalizeResources := false
