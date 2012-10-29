package com.perevillega.p21to30

import scala.util.Random

object P24 extends App {
  
//Lotto: Draw N different random numbers from the set 1..M.
//Example:
//scala> lotto(6, 49)
//res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  
  
  def lotto(n: Int, max: Int): List[Int] = {
    val seq = for{
      i <- 1 to n      
    } yield Random.nextInt(max)
    seq.toList
  }
  
  // The official solution uses P23 to remove elements from a list 1..M
      
  println(lotto(6, 49))

}