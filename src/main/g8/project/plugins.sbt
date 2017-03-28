resolvers += Resolver.sonatypeRepo("releases")

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Styling and static code checkers
addSbtPlugin("org.scalastyle"	%% "scalastyle-sbt-plugin"	% "$sbt_scalastyle_version$")

addSbtPlugin("com.typesafe.sbt"	% "sbt-scalariform" 		% "$sbt_scalariform_version$")

// Measure code coverage of unit tests
addSbtPlugin("org.scoverage"	% "sbt-scoverage"			% "$sbt_scoverage_version$")

addSbtPlugin("com.typesafe.sbt"	% "sbt-git"					% "$sbt_git_version$")
