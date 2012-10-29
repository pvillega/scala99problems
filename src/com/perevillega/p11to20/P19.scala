package com.perevillega.p11to20

object P19 extends App {
  
// Rotate a list N places to the left.
//Examples:
//scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

 
  def rotate[A](i: Int, list: List[A]): List[A] = {
    val (start, end) =  if(i >= 0 ){
      (list.drop(i), list.take(i))
    } else {
      (list.takeRight(i.abs), list.dropRight(i.abs))
    }
    start ::: end
  }
  
    
  println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

}