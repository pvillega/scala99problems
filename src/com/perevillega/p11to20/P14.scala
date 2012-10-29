package com.perevillega.p11to20

object P14 extends App {
  
//Duplicate the elements of a list.
//Example:
//scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)


  def duplicate[A](list: List[A]): List[A] = {
    list.foldLeft(List[A]())( (c, e) => e :: e :: c).reverse   
  }
  
  // Alternative from solution
  def duplicate2[A](list: List[A]): List[A] = {
    list.flatMap { e => List(e,e) }   
  }
  
  println(duplicate(List('a, 'b, 'c, 'c, 'd)))

}