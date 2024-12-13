package com.csc;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ChainLink <T> {
  public String color;
  ChainLink(String color) {
    this.color = color;
  }
  public ChainLink() {
    }
    Node<T> firstNode;
    public void insertEnd(T chain) {
      Node<T> node = new Node<>();
      node.data = chain;
      if (firstNode == null) {
        firstNode = node;
      }
      else {
        Node<T> otherNode = firstNode;
        while (otherNode.next!=null) {
          otherNode = otherNode.next;
        }
        otherNode.next = node;
      }
    }
    public T showDetail(int index) {
      Node<T> node = firstNode;
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
      return node.data;
    }
    public int size(T chain) {
      int sizeIncrement = 1;
      Node<T> node = firstNode;
      while (node.data != chain) {
        node = node.next;
      }
      while (node.next != null) {
      node = node.next;
      sizeIncrement++;
      }
      return sizeIncrement;
    }
    public void insertStart(T chain) {
      Node<T> node = new Node<>();
      node.data = chain;
      node.next = firstNode;
      firstNode = node;
    }
    public static void main(String[] args) {
    ChainLink<String> chain1 = new ChainLink<>("blue");
    ChainLink<String> chain2 = new ChainLink<>("green");
    ChainLink<String> chain3 = new ChainLink<>("yellow");
    ChainLink<String> chain4 = new ChainLink<>("purple");
    ChainLink<ChainLink<String>> chain = new ChainLink<>("");
    chain.insertEnd(chain1);
    chain.insertEnd(chain2);
    chain.insertEnd(chain3);
    chain.insertEnd(chain4);
    ChainLink<String> chainTest = new ChainLink<>();
    chainTest = chain.showDetail(0);
    System.out.println(chainTest.color);
    chainTest = chain.showDetail(1);
    System.out.println(chainTest.color);
    chainTest = chain.showDetail(2);
    System.out.println(chainTest.color);
    chainTest = chain.showDetail(3);
    System.out.println(chainTest.color);
    System.out.println(chain.size(chain3));
    System.out.println(chain.size(chain1));
    System.out.println(chain.size(chain4));
    chain.insertStart(chain2);
    chainTest = chain.showDetail(0);
    System.out.println(chainTest.color);
    chainTest = chain.showDetail(1);
    System.out.println(chainTest.color);
    chainTest = chain.showDetail(2);
    System.out.println(chainTest.color);
  }
}
