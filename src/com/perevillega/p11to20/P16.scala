package com.perevillega.p11to20

object P16 extends App {
  
// Drop every Nth element from a list.
//Example:
//scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)



  def drop[A](n: Int, list: List[A]): List[A] = {
    val tmp = for {
      i <- 0 until list.length
      if (i+1) % n != 0
    } yield list(i)
    tmp.toList
  }
    
  //From solution, a non recursive way  
  def dropFunctional[A](n: Int, ls: List[A]): List[A] = 
    ls.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map { _._1 }
    
  
  println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

}