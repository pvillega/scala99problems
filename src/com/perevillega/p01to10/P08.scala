package com.perevillega.p01to10

object P08 extends App {
  
//Eliminate consecutive duplicates of list elements.
//If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
//Example:
//
//scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

  //can't be done with list.distinct, check sample answer!
  def compress[A](list: List[A]): List[A] = {	
    list.foldLeft(List[A]())( (c, e) => if(!c.isEmpty && c.head == e) c else e :: c ).reverse
  }
  
  println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}