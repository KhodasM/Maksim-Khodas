package org.example;

public class Camel extends Herbivorous implements Land{
  public void walk(){
    System.out.println("Camel walks");
  }
  public void eat(){
    System.out.println("Camel eats " + food);
  }
}
