package com.perevillega.p11to20

object P13 extends App {
  
//Run-length encoding of a list (direct solution).
//Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.
//Example:
//
//scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
       val (span, tail) = list span { _ == list.head }
       val res = (span.length, span.head)
       if (tail.isEmpty) List(res)
       else res :: encodeDirect(tail)      
    }   
  }
  
  // From solution: Can be simplified
  def encodeDirect2[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
       val (span, tail) = list span { _ == list.head }
       (span.length, span.head) :: encodeDirect(tail)             
    }   
  }
  
  println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}