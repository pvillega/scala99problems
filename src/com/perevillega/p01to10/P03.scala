package com.perevillega.p01to10

object P03 extends App {
  
//Find the Kth element of a list.
//By convention, the first element in the list is element 0.
//Example: 
//
//scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2
  
  //could be done as list(n)
  def nth[A](n: Int, list: List[A]): A = n match {
    case 0 => list.head
    case _ => nth(n-1, list.tail)
  } 
  
  println(nth(2, List(1, 1, 2, 3, 5, 8)))

}