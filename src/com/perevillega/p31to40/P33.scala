package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P33 extends App {
  
// Determine whether two positive integer numbers are coprime.
//Two numbers are coprime if their greatest common divisor equals 1.
//scala> 35.isCoprimeTo(64)
//res0: Boolean = true
    
  import P32._
  
  def isCoprimeTo(a: Int, b: Int) = {
    gcd(a, b) == 1
  }
  
  println(isCoprimeTo(35, 64))  

}