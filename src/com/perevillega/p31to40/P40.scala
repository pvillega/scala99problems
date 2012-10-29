package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P40 extends App {
  
//Goldbach's conjecture.
//Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers. E.g. 28 = 5 + 23. 
//It is one of the most famous facts in number theory that has not been proved to be correct in the general case. 
//It has been numerically confirmed up to very large numbers (much larger than Scala's Int can represent). 
//Write a function to find the two prime numbers that sum up to a given even integer.
//scala> 28.goldbach
//res0: (Int, Int) = (5,23)

  import P39._
  import P31._
  
  def goldbach(n: Int): (Int, Int) = {
    val primes = listPrimesinRange(2 to n)
    primes.find( e => isPrime(n - e)) match {
      case None => (0,0) 
      case Some(i) => (i, n-i)
    }
  }
  
  println(goldbach(28))

}