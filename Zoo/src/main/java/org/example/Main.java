package org.example;

public class Main {
  public static void main(String[] args) {
    Horse horse = new Horse();
    Dolphin dolphin = new Dolphin();
    Camel camel = new Camel();
    Eagle eagle = new Eagle();
    Tiger tiger = new Tiger();
    horse.eat();
    horse.walk();
    dolphin.eat();
    dolphin.swim();
    camel.eat();
    camel.walk();
    eagle.eat();
    eagle.fly();
    tiger.eat();
    tiger.walk();
  }
}