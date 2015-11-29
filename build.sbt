name := "scala-template"

version := "0.0.1"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8", "-Xfatal-warnings", "-language:postfixOps")

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies ++= Seq(
  //"com.typesafe"             % "config" % "1.2.1",
  //"io.argonaut"             %% "argonaut" % "6.1-M6",
  //"joda-time"                % "joda-time" % "2.8.2",
  //"net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
  //"org.tpolecat"            %% "doobie-core" % "0.2.3",
  //"com.lihaoyi"             %% "scalatags" % "0.5.3",
  //"org.scalaz"              %% "scalaz-core" % "7.1.5",
  // TESTS
  //"org.scalatest"           %% "scalatest" % "2.2.4"  % "test" withSources() withJavadoc(),
  //"org.scalacheck"          %% "scalacheck" % "1.12.2" % "test" withSources() withJavadoc()
)

//mainClass in Compile := Some("com.example.Main")

//enablePlugins(ScalaJSPlugin)