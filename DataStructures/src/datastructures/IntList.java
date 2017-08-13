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
public class IntList {
  /** Represents links that form the linked list. */
  public class Link {
    // Create a link containing one element.
    private int value;
    Link prev;
    Link next;
      
    Link(int value) {
        this.value = value;
    }
 
    /** Get value. */
    public int get() {
        return value;
    }
 
    /** Set value. */
    public void set(int value) {
        this.value = value;
    }
 
    /** Get next link (or null if none). O(1) */
    public Link next() {
        return next;
    }
 
    /** Get previous link (or null if none). O(1) */
    public Link previous() {
        return prev;
    }
  }
  
  private Link front;
  private Link back;
  private int size;
  
  /** Create an empty list. */
  public IntList() {
      
  }
 
  /** Get first link (or null if empty list). O(1) */
  public Link front() {
      return front;
  }
 
  /** Get last link (or null if empty list). O(1) */
  public Link back() {
      return back;
  }
 
  /** Get size of list. O(1) */
  public int size() {
      return size;
  }
 
  /** Insert at end (returns new link). O(1) */
  public Link insertBack(int value) {
      Link link = new Link(value);
      if(size == 0) {
        front = link;
      } else {
        back.next = link;
        link.prev = back;
      }
      size++;
      back = link;
      return link;
  }
 
  /** Insert at front (returns new link). O(1) */
  public Link insertFront(int value) {
      Link link = new Link(value);
      if(size == 0) {
        back = link;
      } else {
        link.next = front;
        front.prev = link;
      }
      front = link;
      size++;
      return link;
  }
 
  /** Insert after the given link (returns new link). O(1) */
  public Link insert(Link link, int value) {
      Link newLink = new Link(value);
      if(link == back) {
          back = newLink;
      }
      newLink.prev = link;
      link.next = newLink;
      size++;
      return newLink;
  }
 
  /** Remove end (and return it). O(1) */
  public int removeBack() {
      if(size == 1) {
          front = back = null;
      }
      size--;
      return back.value;
  }
 
  /** Remove front (and return it). O(1) */
  public int removeFront() {
      if(size == 1) {
          front = back = null;
      }
      size--;
      return front.value;
  }
 
  /** Remove element (and return it). O(1) */
  public int remove(Link link) {
      if(size == 1) {
          front = back = null;
      }
      size--;
      return link.value;
  }
 
  /** Find first occurrence of value (or null if none found). O(n) */
  public Link find(int value) {
      for(Link link = front(); link != null; link = link.next()) {
          if(link.get() == value)
          {
              return link;
          }
      }
      return null;
  }
 
  /** Get link by index. O(n) */
  public Link getLink(int index) {
      Link link = front();
      for(int count = 0; count < index; link = link.next()) {
          count++;
      }
      return link;
  }
 
  /** Get element by index. O(n) */
  public int get(int index) {
      return getLink(index).get();
  }
 
  /** Test structure. */
  public static void main(String[] args) {
      
  }
}