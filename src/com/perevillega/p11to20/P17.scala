package com.perevillega.p11to20

object P17 extends App {
  
//Split a list into two parts.
//The length of the first part is given. Use a Tuple for your result.
//Example:
//
//scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))


  def split[A](length: Int, list: List[A]): (List[A], List[A]) = {
    list.splitAt(length)
  }
    
  println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

}