name := """cli-docker"""

version := "1.0"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")) .enablePlugins(JavaAppPackaging, DockerPlugin)

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")
scalacOptions += "-target:jvm-1.8"

mainClass in Compile := Some("com.example.Hello")

dockerBaseImage := "java:8u45"
maintainer := "nil"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

