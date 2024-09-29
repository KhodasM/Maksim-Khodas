package org.example;

public class Camel implements Land, Herbivorous{
  public void walk(){
    System.out.println("Верблюд ходит");
  }
  public void eat(){
    System.out.println("Верблюд ест траву");
  }
}
