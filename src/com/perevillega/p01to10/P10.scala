package com.perevillega.p01to10

object P10 extends App {
  
//Run-length encoding of a list.
//Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
//Example:
//
//scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

  //From problem 9 ->
  def pack[A](list: List[A]): List[List[A]] = {
    if (list.isEmpty) List(List())
    else {
      val (span, tail) = list span { _ == list.head }
      if (tail.isEmpty) List(span)
      else span :: pack(tail)
    }   
  }
  
  // We reuse code from problem 9
  def encode[A](list: List[A]): List[(Int, A)] = {
    val tmp = pack(list)
    tmp.map{ e => (e.length, e.head) }
  }
  
  println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}