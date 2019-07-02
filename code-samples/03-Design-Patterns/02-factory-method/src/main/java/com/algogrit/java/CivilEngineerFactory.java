package com.algogrit.java;

public class CivilEngineerFactory implements EngineerFactory {
  public Engineer getEngineer() {
    return new CivilEngineer();
  }
}
