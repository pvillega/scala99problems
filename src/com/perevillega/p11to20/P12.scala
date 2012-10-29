package com.perevillega.p11to20

object P12 extends App {
  
// Decode a run-length encoded list.
//Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
//Example:
//
//scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  def decode[A](list: List[(Int, A)]): List[A] = {
    if (list.isEmpty) Nil
    else {
      for {
        el <- list
        i <- 1 to el._1 
      } yield el._2
    }   
  }
  
  // From solution functional alternative 
  def decode2[A](ls: List[(Int, A)]): List[A] =
    ls flatMap { e => List.fill(e._1)(e._2) }
 
  
  println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))

}