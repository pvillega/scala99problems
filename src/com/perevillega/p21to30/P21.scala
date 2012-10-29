package com.perevillega.p21to30

object P21 extends App {
  
// Insert an element at a given position into a list.
//Example:
//scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
//res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

  def insertAt[A](el: A, pos: Int, list: List[A]): List[A] = {
    val (head, tail) = list.splitAt(pos)
    head ::: (el :: tail)
  }
      
  println(insertAt('new, 1, List('a, 'b, 'c, 'd)))

}