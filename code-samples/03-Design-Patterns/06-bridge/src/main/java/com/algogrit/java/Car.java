package com.algogrit.java;

// PetrolEngine
// DieselEngine
// HybridEngine
// ElectricEngine

public class Car implements Vehicle {
  Engine engine;

  public Car() {
    this.engine = new ElectricEngine();
  }

  public Car(Engine engine) {
    this.engine = engine;
  }

  public void runsOn() {
    System.out.println("Car runs on: " + engine.getFuelType());
  }
}
