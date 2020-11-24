import sbt._

object Dependencies {

  object Test {
    private val scalatestVersion = "3.2.3"

    val deps = Seq(
      "org.scalatest" %% "scalatest" % scalatestVersion  % "test"
    )
  }

  object Cats {
    private val catsEffectVersion = "2.3.0-M1"
    private val catsVersion = "2.2.0"

    val deps = Seq(
        "org.typelevel" %% "cats-effect" % catsEffectVersion
      , "org.typelevel" %% "cats-core" % catsVersion
    )
  }
}
