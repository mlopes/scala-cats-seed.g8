import sbt._

object Dependencies {

  object Test {
    private val scalatestVersion = "3.0.8"

    val deps = Seq(
      "org.scalatest" %% "scalatest" % scalatestVersion  % "test"
    )
  }

  object Cats {
    private val catsEffectVersion = "2.0.0"
    private val catsVersion = "2.1.0-RC2"

    val deps = Seq(
        "org.typelevel" %% "cats-effect" % catsEffectVersion
      , "org.typelevel" %% "cats-core" % catsVersion
    )
  }
}
