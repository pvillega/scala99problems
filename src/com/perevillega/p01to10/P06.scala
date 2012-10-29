package com.perevillega.p01to10

object P06 extends App {
  
//Find out whether a list is a palindrome.
//Example:
//scala> isPalindrome(List(1, 2, 3, 2, 1))
//res0: Boolean = true

  def isPalindrome[A](list: List[A]): Boolean = list == list.reverse
  
  println(isPalindrome(List(1, 2, 3, 2, 1)))

}