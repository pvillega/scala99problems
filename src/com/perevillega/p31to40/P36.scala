package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P36 extends App {
  
//Determine the prime factors of a given positive integer (2).
//Construct a list containing the prime factors and their multiplicity.
//scala> 315.primeFactorMultiplicity
//res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
//Alternately, use a Map for the result.
//
//scala> 315.primeFactorMultiplicity
//res0: Map[Int,Int] = Map(3 -> 2, 5 -> 1, 7 -> 1)
    
  import P35._
  
  def primeFactorMultiplicity(n: Int): Map[Int,Int] = {
    primeFactors(n).groupBy{ e => e }.map{ case (k,v) => (k, v.length)}
  }
  
  def primeFactorMultiplicityList(n: Int): List[(Int,Int)] = {
    primeFactorMultiplicity(n).toList.sortWith{ (a,b) => a._1 < b._1 }    
  }
  
  println(primeFactorMultiplicity(315))
  println(primeFactorMultiplicityList(315))
  println(primeFactorMultiplicityList(10)) 

}