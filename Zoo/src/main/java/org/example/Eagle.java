package org.example;

public class Eagle extends Predator implements Flying{
  public void fly(){ System.out.println("Eagle flies"); }
  public void eat() { System.out.println("Eagle eats " + allfood); }
}
