package org.example;

public class Dolphin extends Predator implements Waterfowl {
  public void swim() {
    System.out.println("Dolphin swims");
  }
  public void eat() {
    System.out.println("Dolphin eats " + fishfood);
  }
}
