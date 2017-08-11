/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author matth
 */
/** Stores a list of integers in a linked list. */
//public class IntList {
//  /** Represents links that form the linked list. */
//  public class Link {
//    // Create a link containing one element.
//    Link(int list) {
//    }
// 
//    /** Get value. */
//    public int get() {
//    }
// 
//    /** Set value. */
//    public void set(int value) {
//    }
// 
//    /** Get next link (or null if none). O(1) */
//    public Link next() {
//    }
// 
//    /** Get previous link (or null if none). O(1) */
//    public Link previous() {
//    }
//  }
// 
//  /** Create an empty list. */
//  public IntList() {
//  }
// 
//  /** Get first link (or null if empty list). O(1) */
//  public Link front() {
//  }
// 
//  /** Get last link (or null if empty list). O(1) */
//  public Link back() {
//  }
// 
//  /** Get size of list. O(1) */
//  public int size() {
//  }
// 
//  /** Insert at end (returns new link). O(1) */
//  public Link insertBack(int value) {
//  }
// 
//  /** Insert at front (returns new link). O(1) */
//  public Link insertFront(int value) {
//  }
// 
//  /** Insert before element (returns new link). O(1) */
//  public Link insert(Link link, int value) {
//  }
// 
//  /** Remove end (and return it). O(1) */
//  public int removeBack() {
//  }
// 
//  /** Remove front (and return it). O(1) */
//  public int removeFront() {
//  }
// 
//  /** Remove element (and return it). O(1) */
//  public int remove(Link link) {
//  }
// 
//  /** Find first occurance of value (or null if none found). O(n) */
//  public Link find(int value) {
//  }
// 
//  /** Get link by index. O(n) */
//  public Link getLink(int index) {
//  }
// 
//  /** Get element by index. O(n) */
//  public int get(int index) {
//  }
// 
//  /** Test structure. */
//  public static void main(String[] args) {
//    IntList list = new IntList();
// 
//    // Insert increasing numbers into list
//    int limit = 100;
//    for (int i = 1; i <= limit; ++i) {
//      list.insert(i);
//    }
// 
//    // Remove some middle numbers
//    IntList.Link temp1 = list.getLink(50);
//    for (int i = 1; i <= 2; ++i) {
//      IntList.Link temp2 = temp1.previous();
//      list.remove(temp1);
//      temp1 = temp2;
//    }
// 
//    // Put them back
//    temp1 = temp1.next();
//    for (int i = 1; i <= 2; ++i) {
//      temp1 = list.insert(temp1, 48 + i);
//    }
// 
//    // Check coherance
//    IntList.Link current = list.front();
//    for (int i = 1; current != null; ++i) {
//      if (current.get() !=
//      current = current.next();
//    }
//  }
//}