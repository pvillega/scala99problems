package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P32 extends App {
  
// Determine the greatest common divisor of two positive integer numbers.
//Use Euclid's algorithm.
//scala> gcd(36, 63)
//res0: Int = 9
    
  def gcd(a: Int, b: Int): Int = {
    if(b == 0) a
    else gcd(b, a % b)
  }
  
  println(gcd(36, 63))  

}