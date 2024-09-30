package org.example;

public class Horse extends Herbivorous implements Land {
  public void walk() {
    System.out.println("Horse walks");
  }
  public void eat(){
    System.out.println("Horse eats " + food);
  }
}
