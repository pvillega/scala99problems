package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P39 extends App {

//   A list of prime numbers.
//Given a range of integers by its lower and upper limit, construct a list of all prime numbers in that range.
//scala> listPrimesinRange(7 to 31)
//res0: List[Int] = List(7, 11, 13, 17, 19, 23, 29, 31)
  
  import P31._
  
  def listPrimesinRange(r: Range): List[Int] = {
    r.filter{ i => isPrime(i) }.toList
  }
  
  println(listPrimesinRange(7 to 31))

}