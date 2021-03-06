import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info) {
    val ivyLocal = "Local Ivy Repository" at "file://"+Path.userHome+"/.ivy2/local"
    val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
    val databinder = "Databinder Repository" at "http://databinder.net/repo"
    //val scalatools_snapshot = "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/"
    //val scalatools_release = "Scala Tools Snapshot" at "http://scala-tools.org/repo-releases/"

    val liftVersion = "2.1-SNAPSHOT"

    override def libraryDependencies = Set(
        "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
        "net.liftweb" %% "lift-record" % liftVersion % "compile->default",
        "net.liftweb" %% "lift-squeryl-record" % liftVersion % "compile->default",
        "org.squeryl" %% "squeryl" % "0.9.4beta8-enums" % "compile->runtime",
        "joda-time" % "joda-time" % "1.6",
        "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default",
        "com.h2database" % "h2" % "1.2.121",
        "cglib" % "cglib-nodep" % "2.2"
    ) ++ super.libraryDependencies
}
