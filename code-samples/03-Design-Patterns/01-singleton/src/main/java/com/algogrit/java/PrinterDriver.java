package com.algogrit.java;

import java.util.ArrayList;
import java.util.List;

public class PrinterDriver {
  private List<Object> queue = new ArrayList<Object>();

  private static PrinterDriver INSTANCE = new PrinterDriver();

  public static PrinterDriver getInstance() {
    return INSTANCE;
  }

  private PrinterDriver() {
    System.out.println("Instance created!");
  }

  public void print(Object o) {
    this.queue.add(o);
    lazyPrint();
  }

  public void lazyPrint() {
    System.out.println("I will lazily print the objects");
  }
}
