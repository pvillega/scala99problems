package com.perevillega.p11to20

object P15 extends App {
  
// Duplicate the elements of a list a given number of times.
//Example:
//scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)


  def duplicateN[A](n: Int, list: List[A]): List[A] = {
    list.flatMap { e => List.fill(n)(e) }      
  }
    
  println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))

}