package org.example;

public class Horse implements Herbivorous, Land {
  public void walk() {
    System.out.println("Лошадь ходит");
  }
  public void eat() {
    System.out.println("Лошадь ест траву");
  }
}
