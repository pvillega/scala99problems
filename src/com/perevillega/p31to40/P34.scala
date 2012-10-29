package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P34 extends App {
  
//Calculate Euler's totient function phi(m).
//Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
//scala> 10.totient
//res0: Int = 4
    
  import P33._
  
  def totient(n: Int): Int = {
    def loop(curr: Int) : Int = {
      if(curr < 1) 0
	  else (if(isCoprimeTo(curr, n)) 1 else 0) + loop(curr - 1)
    }
    loop(n)
  }
  
  //Better way from solution
  def totient2(start: Int): Int = (1 to start) filter { isCoprimeTo(_, start) } length
  
  println(totient(10))  

}