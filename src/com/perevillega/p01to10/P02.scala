package com.perevillega.p01to10

object P02 extends App {
  
// Find the last but one element of a list.
//Example:
//scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5
  
  def penultimate[A](list: List[A]): A = list match {
    case Nil => throw new Exception("Empty list")
    case head :: _ :: Nil => head
    case _ :: tail => penultimate(tail)   
  }
  
  println(penultimate(List(1, 1, 2, 3, 5, 8)))

}