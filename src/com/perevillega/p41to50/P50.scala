package com.perevillega.p41to50

import scala.util.Random
import scala.math._

object P50 extends App {
  
//Huffman code.
//First of all, consult a good book on discrete mathematics or algorithms for a detailed description of Huffman codes!
//We suppose a set of symbols with their frequencies, given as a list of (S, F) Tuples.
//E.g. (("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5)). 
//Our objective is to construct a list of (S, C) Tuples, where C is the Huffman code word for the symbol S.
//
//scala> huffman(List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5)))
//res0: List[String, String] = List((a,0), (b,101), (c,100), (d,111), (e,1101), (f,1100))

  def huffman(list: List[(String, Int)]): List[(String, String)] = {
    //Traverses the tree to find the encoding of a given symbol
    def findCode(node: Node, s: String): String = node match {
      case Leaf(_, _) => ""
      case Branch(left, right, _, _) =>
        if(left.chars.contains(s)) "0" + findCode(left, s)
        else if(right.chars.contains(s)) "1" + findCode(right, s)
        else "-1"         		
    }    
    
	//From wikipedia:
    //Create a leaf node for each symbol and add it to the priority queue.
	//While there is more than one node in the queue:
	// Remove the two nodes of highest priority (lowest probability) from the queue
	// Create a new internal node with these two nodes as children and with probability equal to the sum of the two nodes' probabilities.
	// Add the new node to the queue.
	//The remaining node is the root node and the tree is complete.
    def createHuffmanTree(l: List[(String, Int)]): Node = {
      def merge(nodeList: List[Node]): List[Node] = nodeList match {
          case head :: Nil => nodeList
          case one :: two :: tail => {
            val branch = new Branch(one, two, one.chars ::: two.chars, one.weight + two.weight)
            val sorted = (branch :: tail).sortWith( (a,b) => a.weight < b.weight)
            merge(sorted)
          }
      }
      //convert list to leaf list and sort by weight 
      val leafs = l.map{ e => new Leaf(e._1, e._2) }.sortWith( (a,b) => a.weight < b.weight)
      merge(leafs).head            
    }
    
    // 1) create tree
    val tree = createHuffmanTree(list)
    
    // 2) map letters to code in tree
    list.map{ case (s, i) => (s, findCode(tree, s))}
  }
  
  //print generated and expected
  println(huffman(List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5))))  
  println(List(("a",0), ("b",101), ("c",100), ("d",111), ("e",1101), ("f",1100)))
}

abstract case class Node(chars: List[String], weight: Int) 

case class Branch(left: Node, right: Node, cs: List[String], w: Int) extends Node(cs, w) 

case class Leaf(c: String, w: Int) extends Node(List(c), w) 