package com.csc;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ChainLink {
  public String color;

  ChainLink(String color) {
    this.color = color;
  }
  Node firstNode;
  public void insertEnd(ChainLink chain) {
    Node node = new Node();
    node.data = chain;
    if (firstNode == null) {
      firstNode = node;
    }
    else {
      Node otherNode = firstNode;
      while (otherNode.next!=null) {
        otherNode = otherNode.next;
      }
      otherNode.next = node;
    }
  }
  public void showDetail(int index) {
    Node node = firstNode;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    System.out.println(node.data.color);
  }
  public static void main(String[] args) {
    ChainLink chain1 = new ChainLink("blue");
    ChainLink chain2 = new ChainLink("green");
    ChainLink chain3 = new ChainLink("yellow");
    ChainLink chain4 = new ChainLink("purple");
    ChainLink chain = new ChainLink("");
    chain.insertEnd(chain1);
    chain.insertEnd(chain2);
    chain.insertEnd(chain3);
    chain.insertEnd(chain4);
    chain.showDetail(0);
    chain.showDetail(1);
    chain.showDetail(2);
    chain.showDetail(3);
  }
}
