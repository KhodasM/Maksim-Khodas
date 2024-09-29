package org.example;

public class Eagle implements Predator, Flying{
  public void fly(){
    System.out.println("Орел летит");
  }
  public void eat(){
    System.out.println("Орел ест мясо и рыбу");
  }
}
