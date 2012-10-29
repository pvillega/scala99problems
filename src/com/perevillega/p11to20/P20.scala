package com.perevillega.p11to20

object P20 extends App {
  
// Remove the Kth element from a list.
//Return the list and the removed element in a Tuple. Elements are numbered from 0.
//Example:
//
//scala> 
//res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

  def removeAt[A](i: Int, list: List[A]): (List[A], A) = {
    val (head, tail) = list.splitAt(i)
    (head ::: tail.tail , tail.head)
  }
      
  println(removeAt(1, List('a, 'b, 'c, 'd)))

}