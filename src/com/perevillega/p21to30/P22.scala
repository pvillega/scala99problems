package com.perevillega.p21to30

object P22 extends App {
  
//Create a list containing all integers within a given range.
//Example:
//scala> range(4, 9)
//res0: List[Int] = List(4, 5, 6, 7, 8, 9)

  //Also as List.range(start, end + 1)
  def range(start: Int, end: Int): List[Int] = {
    val seq = for(i <- start to end) yield i
    seq.toList
  }
      
  println(range(4, 9))

}