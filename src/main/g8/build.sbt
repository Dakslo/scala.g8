name := """$name$"""

version := "$version$"

mainClass := Some("""$name;format="Camel"$""")

organization := "$organization$"

scalaVersion := "$scala_version$"

resolvers++= Seq(
	"Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

// Production
libraryDependencies ++= Seq(
	"com.typesafe.scala-logging"	%% "scala-logging" 	% "$scala_logging_version$",
	"com.github.nscala-time" 		%% "nscala-time" 	% "$nscala_time_version$",
	"ch.qos.logback" 				% "logback-classic"	% "$logback_version$"
)

// Test
libraryDependencies ++= Seq(
	"org.scalatest" 				%% "scalatest" 		% "$scalatest_version$" 	% "test"
)

// Code coverage checks
coverageMinimum := 70

coverageFailOnMinimum := true

coverageHighlighting := scalaBinaryVersion.value == "2.12"

// Apply default Scalariform formatting.
// Reformat at every compile.
// c.f. https://github.com/sbt/sbt-scalariform#advanced-configuration for more options.
scalariformSettings

ScalariformKeys.preferences := ScalariformKeys.preferences.value
.setPreference(AlignSingleLineCaseStatements, true)
.setPreference(DoubleIndentClassDeclaration, true)
.setPreference(DoubleIndentMethodDeclaration, true)
.setPreference(FormatXml, false)
.setPreference(IndentLocalDefs, true)
.setPreference(IndentWithTabs, true)
.setPreference(PreserveDanglingCloseParenthesis, true)
.setPreference(MultilineScaladocCommentsStartOnFirstLine, true)

scalastyleFailOnError := true

scalacOptions ++= Seq(
	"-deprecation",
	"-encoding", "UTF-8", // yes, this is 2 args
	"-feature",
	"-unchecked",
	"-language:higherKinds",
	"-Xfatal-warnings",
	"-Xlint",
	"-Yno-adapted-args",
	"-Ywarn-numeric-widen",
	"-Ywarn-value-discard",
	"-Xfuture"
)
