package com.perevillega.p21to30

import scala.util.Random

object P25 extends App {
  
//Generate a random permutation of the elements of a list.
//Hint: Use the solution of problem P23.
//Example:
//
//scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
//res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  
  
  def randomPermute[A](list: List[A]): List[A] = {
    if(list.isEmpty) Nil
    else {
    	val e = list(Random.nextInt(list.length))
		e :: randomPermute(list.filterNot( _ == e))
    }
  }
     
  println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))

}