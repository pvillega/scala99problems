package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P37 extends App {
  
//Calculate Euler's totient function phi(m) (improved).
//See problem P34 for the definition of Euler's totient function. 
//If the list of the prime factors of a number m is known in the form of problem P36 then the function phi(m>) can be efficiently calculated as follows:
//
//Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and their multiplicities) of a given number m. 
//Then phi(m) can be calculated with the following formula:
//phi(m) = (p1-1)*p1(m1-1) * (p2-1)*p2(m2-1) * (p3-1)*p3(m3-1) * ...
//
//Note that ab stands for the bth power of a.
//scala> 10.totient
//res0: Int = 4
    
  import P36._
  
  def totient(n: Int): Int = {
    val list = primeFactorMultiplicityList(n)
    list.foldLeft(1){ (c, a) => c * ((a._1 - 1) * pow(a._1, a._2 - 1).toInt) }
  }
  
  println(totient(10))  

}