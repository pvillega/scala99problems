package com.perevillega.p11to20

object P11 extends App {
  
//Modified run-length encoding.
//Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
//Example:
//
//scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))

  //From problem 9 ->
  def pack[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(List())
    else {
      val (span, tail) = list span { _ == list.head }
      if (tail.isEmpty) List(span)
      else span :: pack(tail)
    }   
  }
  
  // From problem 10, modified
  def encode[A](list: List[A]): List[Any] = {
    val tmp = pack(list)
    tmp. map{ e => if(e.length > 1) (e.length, e.head) else e.head }
  }
  
  // From solution, a more typesafe version in 2 steps: encode and filter
  def encodeModified2[A](ls: List[A]): List[Either[A, (Int, A)]] = {
    val tmp = pack(ls) .map{ e => (e.length, e.head) }  
    tmp map { t => if (t._1 == 1) Left(t._2) else Right(t) }
  }
  
  println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}