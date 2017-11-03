package org.accentur.counter;

public class SingleCounter {
  private static SingleCounter instance;
  private int counter;

  private SingleCounter() {
    counter = 0;
    instance = null;
  }

  public static SingleCounter getInstance() {
    if (instance == null) {
      instance = new SingleCounter();
    }

    return instance;
  }

  public int getCounter() {
    return counter++;
  }
}
