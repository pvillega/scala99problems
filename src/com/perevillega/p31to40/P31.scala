package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P31 extends App {
  
//  Determine whether a given integer number is prime.
//scala> 7.isPrime
//res0: Boolean = true
   
    
  def isPrime(n: Int): Boolean = {
    def isDivisible(curr: Int): Boolean = {
      if(curr > sqrt(n)) true
      else (n % curr != 0) && isDivisible(curr + 1)
    }
    isDivisible(2)
  }
  
  println(isPrime(7))
  println(isPrime(14))
  println(isPrime(9))
}