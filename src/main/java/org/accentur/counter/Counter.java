package org.accentur.counter;

/*
 * *Implementing counter object
 */

public class Counter {
  private int counter;

  public Counter() {
    counter = 0;
  }


  public int getCounter() {
    return counter++;
  }
}
