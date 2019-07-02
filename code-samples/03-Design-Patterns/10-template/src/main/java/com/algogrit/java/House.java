package com.algogrit.java;

public abstract class House {
  public void build() {
    System.out.println("Laying foundation...");
    this.layWalls();
    System.out.println("Lay the roof");
    System.out.println("Place windows and doors");
    System.out.println("Finish with interiors");
  };

  abstract void layWalls();
}
