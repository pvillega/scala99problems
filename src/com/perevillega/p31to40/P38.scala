package com.perevillega.p31to40

import scala.util.Random
import scala.math._

// To keep the code broken by problems the arithmetic methods are not part of the given class 

object P38 extends App {
  
//Compare the two methods of calculating Euler's totient function.
//Use the solutions of problems P34 and P37 to compare the algorithms. Try to calculate phi(10090) as an example.
    
  // P34 causes a stack overflow error on the recursivity. It probably could be solved by using a recursive tail method like the suggested solution
  // or we simply use the P37 way :)
  // println(P34.totient(10090)) 
  
  println(P37.totient(10090))

}