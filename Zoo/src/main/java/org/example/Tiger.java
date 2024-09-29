package org.example;

public class Tiger implements Land, Predator{
  public void walk(){
    System.out.println("Тигр ходит");
  }
  public void eat(){
    System.out.println("Тигр ест мясо");
  }
}
