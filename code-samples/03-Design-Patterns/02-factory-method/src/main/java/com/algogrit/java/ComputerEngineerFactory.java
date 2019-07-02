package com.algogrit.java;

public class ComputerEngineerFactory implements EngineerFactory {
  public Engineer getEngineer() {
    return new ComputerEngineer();
  }
}
