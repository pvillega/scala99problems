package com.perevillega.p01to10

object P01 extends App {
  
//   Find the last element of a list.
//   Example:
//	   scala> last(List(1, 1, 2, 3, 5, 8))
//	   res0: Int = 8
  
  def last(list: List[Int]) = {
	  //list.tail.reverse.head
	  list.last
  }
  
  println(last(List(1, 1, 2, 3, 5, 8)))

}