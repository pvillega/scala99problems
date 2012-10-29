package com.perevillega.p21to30

import scala.util.Random

object P23 extends App {
  
// Extract a given number of randomly selected elements from a list.
//Example:
//scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
//res0: List[Symbol] = List('e, 'd, 'a)
//Hint: Use the solution to problem P20
  
  // From 20 ->
  def removeAt[A](i: Int, list: List[A]): (List[A], A) = {
    val (head, tail) = list.splitAt(i)
    (head ::: tail.tail , tail.head)
  }
  
  def randomSelect[A](size: Int, list: List[A]): List[A] = {
    if(list.length <= size) list
    else randomSelect(size, removeAt(Random.nextInt(list.size),list)._1)
  }
      
  println(randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)))

}