package com.perevillega.p41to50

import scala.util.Random
import scala.math._

object P49 extends App {
  
//Gray code.
//An n-bit Gray code is a sequence of n-bit strings constructed according to certain rules. For example,
//n = 1: C(1) = ("0", "1").
//n = 2: C(2) = ("00", "01", "11", "10").
//n = 3: C(3) = ("000", "001", "011", "010", "110", "111", "101", "100").
//Find out the construction rules and write a function to generate Gray codes.
//
//scala> gray(3)
//res0 List[String] = List(000, 001, 011, 010, 110, 111, 101, 100)
//See if you can use memoization to make the function more efficient.

  def gray(n: Int): List[String] = {    
    if(n == 0) List("")
    else {
	  val seq = for{	    
	    l <- gray(n-1)
	    e <- List("0","1")  
	  } yield e + l 
	  seq.toList
    }
  }
  
  println(gray(1))
  println(gray(2))
  println(gray(3))
  
}