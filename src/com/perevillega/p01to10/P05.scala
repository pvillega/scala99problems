package com.perevillega.p01to10

object P05 extends App {
  
//Reverse a list.
//Example:
//scala> reverse(List(1, 1, 2, 3, 5, 8))
//res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  
  //could be done as list.reverse
  def reverse[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case head :: tail => reverse(tail) ::: List(head)
  } 
  
  // Pure functional (from solutions)
  def reverseFunctional[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) { (r, h) => h :: r }
  
  println(reverse(List(1, 1, 2, 3, 5, 8)))

}