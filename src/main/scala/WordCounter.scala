package com.brkyvz.spark

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import scala.collection.Map

class WordCounter(sc: SparkContext) {
  
  def count(file: String): Map[String, Long] = {
    sc.textFile(file).flatMap(line => line.split(" ")).map(word => (word, 1)).countByKey()
  }
  
}