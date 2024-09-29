package org.example;

public class Dolphin implements Waterfowl, Predator {
  public void swim() {
    System.out.println("Дельфин плавает");
  }
  public void eat() {
    System.out.println("Дельфин ест рыбу");
  }
}
