// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.10.4"

sparkVersion := "1.3.0"

version := "0.1.3"

spAppendScalaVersion := true

// change the value below to change the directory where your zip artifact will be created
spDistDirectory := target.value

licenses := Seq("Apache-2.0" -> url("https://github.com/brkyvz/demo-scala-python/blob/master/LICENSE"))

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials3")

sparkComponents += "core"

// add any sparkPackageDependencies using sparkPackageDependencies.
// e.g. sparkPackageDependencies += "databricks/spark-avro:0.1"
sparkPackageName := "brkyvz/demo-scala-python"
