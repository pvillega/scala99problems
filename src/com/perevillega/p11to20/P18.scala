package com.perevillega.p11to20

object P18 extends App {
  
// Extract a slice from a list.
//Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
//Example:
//
//scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//res0: List[Symbol] = List('d, 'e, 'f, 'g)

  //can be done as list.slice(i, k) 
  def slice[A](i: Int, k: Int, list: List[A]): List[A] = {
    def sliceIt(i: Int, k: Int, current: Int, list: List[A]): List[A] = {
      if(current < i) sliceIt(i, k, current + 1, list.tail)
      else if(current >= k) Nil
      else list.head :: sliceIt(i, k, current + 1, list.tail)
    }
    sliceIt(i, k, 0, list)
  }
  
  // From solution, Functional
  def sliceFunctional[A](s: Int, e: Int, ls: List[A]): List[A] =
    ls drop s take (e - (s max 0))
    
  println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

}