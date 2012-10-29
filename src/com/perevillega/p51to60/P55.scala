package com.perevillega.p51to60

import scala.util.Random
import scala.math._

// Tree problems will use the tree structures defined in com.perevillega.p51to60.Tree as provided by the website
// Although in theory we should extend Tree, to store 1 problem per file the problems will be solved as external functions

object P55 extends App {

//Construct completely balanced binary trees.
//In a completely balanced binary tree, the following property holds for every node: 
// The number of nodes in its left subtree and the number of nodes in its right subtree are almost equal, which means their difference is not greater than one.
//Define an object named Tree. Write a function Tree.cBalanced to construct completely balanced binary trees for a given number of nodes. 
//The function should generate all solutions. The function should take as parameters the number of nodes and a single value to put in all of them.
//
//scala> Tree.cBalanced(4, "x")
//res0: List(Node[String]) = List(T(x T(x . .) T(x . T(x . .))), T(x T(x . .) T(x T(x . .) .)), ...

  def cBalanced(nodes: Int, value: String): List[Node[String]] = {    
    Nil //TODO
  }
  
  println(cBalanced(4, "x"))
  
}