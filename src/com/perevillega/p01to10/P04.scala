package com.perevillega.p01to10

object P04 extends App {
  
//Find the number of elements of a list.
//Example:
//scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6
  
  //could be done as list.length
  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }
  
  // Better approach (from solutions) More pure functional solution, with folds.
  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }
  
  println(length(List(1, 1, 2, 3, 5, 8)))

}