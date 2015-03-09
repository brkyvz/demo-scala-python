// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.11.5"

sparkVersion := "1.2.1"

resolvers += "Staging repo" at "https://repository.apache.org/content/repositories/orgapachespark-1069" 

version := "0.1"

// spAppendScalaVersion := true

// change the value below to change the directory where your zip artifact will be created
spDistDirectory := target.value

licenses := Seq("Apache-2.0" -> url("https://github.com/brkyvz/demo-scala-python/blob/master/LICENSE"))

credentials += Credentials(Path.userHome / ".ivy2" / ".sbtcredentials")

sparkComponents += "core"

// add any sparkPackageDependencies using sparkPackageDependencies.
// e.g. sparkPackageDependencies += "databricks/spark-avro:0.1"
sparkPackageName := "brkyvz/demo-scala-python"
