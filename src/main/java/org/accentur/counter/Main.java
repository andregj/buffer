package org.accentur.counter;

public class Main {
  public static void main(String[] args) {
   SingleCounter counter = SingleCounter.getInstance();
   
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    System.out.println(counter.getCounter());
    

    SingleCounter counter2 = SingleCounter.getInstance();
  System.out.println(counter2.getCounter());
  System.out.println(counter2.getCounter());
  
  SingleCounter counter3 = SingleCounter.getInstance();
  System.out.println(counter3.getCounter());
  System.out.println(counter3.getCounter());
  }
}
