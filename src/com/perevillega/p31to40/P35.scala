package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P35 extends App {
  
// Determine the prime factors of a given positive integer.
//Construct a flat list containing the prime factors in ascending order.
//scala> 315.primeFactors
//res0: List[Int] = List(3, 3, 5, 7)
    
  import P31._
  
  def primeFactors(n: Int): List[Int] = {
    def calcPrimes(c: Int, l: List[Int]) : List[Int] = {
      if(c == 0) Nil
      else {
        l.find(e => c % e == 0) match {
          case None => Nil
          case Some(i) => i :: calcPrimes(c / i, l)
        }        
      }
    }    
    val listOfPrimes = (2 to n).filter{ e => isPrime(e) && n % e == 0 }.toList
    calcPrimes(n, listOfPrimes)
  }
  
  println(primeFactors(315))
  println(primeFactors(10))  

}