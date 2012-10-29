package com.perevillega.p41to50

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P41 extends App {
  
//A list of Goldbach compositions.
//Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.
//scala> printGoldbachList(9 to 20)
//10 = 3 + 7
//12 = 5 + 7
//14 = 3 + 11
//16 = 3 + 13
//18 = 5 + 13
//20 = 3 + 17
//In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than, say, 50. 
//Try to find out how many such cases there are in the range 2..3000.
//
//Example (minimum value of 50 for the primes):
//
//scala> printGoldbachListLimited(1 to 2000, 50)
//992 = 73 + 919
//1382 = 61 + 1321
//1856 = 67 + 1789
//1928 = 61 + 1867

  import com.perevillega.p31to40.P40._  
  
  //No result, only prints!
  def printGoldbachList(r: Range) {
    r.filter{ i => i % 2 == 0 }. map { n =>
     val res = goldbach(n) 
     println("%d = %d + %d".format(n, res._1, res._2 ))
    }    
  }
  
  def printGoldbachListLimited(r: Range, limit: Int) {
    r.filter{ i => i % 2 == 0 }. map { n =>
     val res = goldbach(n) 
     if(res._1 > limit && res._2 > limit){
    	 println("%d = %d + %d".format(n, res._1, res._2 ))
     }
    }    
  }  
  
  printGoldbachList(9 to 20)
  printGoldbachListLimited(1 to 2000, 50)

}