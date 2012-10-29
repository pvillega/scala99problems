package com.perevillega.p21to30

import scala.util.Random
import scala.math.Ordering

object P27 extends App {
  
//Group the elements of a set into disjoint subsets.
//a) In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons? Write a function that generates all the possibilities.
//Example:
//
//scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
//res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
//b) Generalize the above predicate in a way that we can specify a list of group sizes and the predicate will return a list of groups.
//
//Example:
//
//scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
//res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...
//Note that we do not want permutations of the group members; i.e. ((Aldo, Beat), ...) is the same solution as ((Beat, Aldo), ...). However, we make a difference between ((Aldo, Beat), (Carla, David), ...) and ((Carla, David), (Aldo, Beat), ...).
//
//You may find more about this combinatorial problem in a good book on discrete mathematics under the term "multinomial coefficients".
 
  def group3[A <% Ordered[A]](list: List[A]): List[List[List[A]]] = {
    //we do all combinations of 2/3/4, sort elements inside and remove duplicates
    val c2 = list.combinations(2).toList.map{ e => e.sorted }.distinct
    val c3 = list.combinations(3).toList.map{ e => e.sorted }.distinct
    val c4 = list.combinations(4).toList.map{ e => e.sorted }.distinct
    
    // join checking conditions
    val seq = for{
      a <- c2
      b <- c3
      if ! a.exists( e => b.contains(e))
      c <- c4
      if ! a.exists( e => c.contains(e)) && ! b.exists( e => c.contains(e))
    } yield List(a, b, c)
    seq.toList
  }
  

  //From official solution, more elegant algorithm
  
  def group3Of[A](ls: List[A]): List[List[List[A]]] = {
    val seq = for {
      a <- ls.combinations(2)
      noA = ls -- a
      b <- noA.combinations(3)
    } yield List(a, b, noA -- b)
    seq.toList
  }

  def groupOf[A](ns: List[Int], ls: List[A]): List[List[List[A]]] = ns match {
    case Nil     => List(Nil)
    case n :: ns => ls.combinations(n) flatMap { c =>
      groupOf(ns, ls -- c) map {c :: _}
    } toList
  }
  
  println(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")))

}