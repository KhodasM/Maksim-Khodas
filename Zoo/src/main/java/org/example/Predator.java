package org.example;

public abstract class Predator extends Animal {
  protected final String meatfood = "meat";
  protected final String fishfood = "fish";
  protected final String allfood = "meat and fish";
  public Predator() {}
  public abstract void eat();
}
