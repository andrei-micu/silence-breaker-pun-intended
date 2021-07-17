name := "silence-breaker-pun-intended"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("silence.breaker")

libraryDependencies ++= Seq(
  "com.lucidchart" %% "xtract" % "2.2.1",
  "io.spray" %%  "spray-json" % "1.3.6",

  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

dependencyOverrides ++= Seq(
  "org.typelevel" %% "cats-core" % "2.6.1",
  "org.typelevel" %% "cats-kernel" % "2.6.1"
)
