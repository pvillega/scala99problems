package com.perevillega.p41to50

import scala.util.Random
import scala.math._

object P47 extends App {
  
// Truth tables for logical expressions (2).
//Continue problem P46 by redefining and, or, etc as operators. (i.e. make them methods of a new class with an implicit conversion from Boolean.) not will have to be left as a object method.
//scala> table2((a: Boolean, b: Boolean) => a and (a or not(b)))
//A     B     result
//true  true  true
//true  false true
//false true  false
//false false false

  //Only print, don't import P46 to avoid conflicts with method names
  def table2(f: (Boolean, Boolean) => Boolean) {
    println("A   B   Res")
    println("T   T   %s".format(f(true,true)))
    println("T   F   %s".format(f(true,false)))
    println("F   T   %s".format(f(false,true)))
    println("F   F   %s".format(f(false,false)))        
  }
  
  import Logic._
  table2((a: Boolean, b: Boolean) => a and (a or (b neg)))
}

class Logic(a: Boolean){
  import Logic._
  
  def neg = if(a) false else true
  
  def and(b: Boolean) = (a,b) match {
    case (true, true) => true
    case _ => false
  }
  
  def or(b: Boolean) = (a,b) match {
    case (false, false) => false
    case _ => true
  }
  def nand(b: Boolean) = (this and b) neg
  def nor(b: Boolean) = (this or b) neg
  
  def equ(b: Boolean) = (this and b) or ((a neg) and (b neg) )
  def xor(b: Boolean) = (this equ b) neg
  def impl(b: Boolean) = (this neg) or b
}

object Logic {
  implicit def booleanToLogic(a: Boolean): Logic = new Logic(a)
}
