package org.example;

public class Tiger extends Predator implements Land{
  public void walk(){
    System.out.println("Tiger walks");
  }
  public void eat(){
    System.out.println("Tiger eats " + meatfood);
  }
}
