package com.algogrit.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IntegerBox implements Iterable<Integer> {
  private final List<Integer> list = new ArrayList<>();

  public void add(int in) {
    list.add(in);
  }

  public List<Integer> getData() {
    return list;
  }

  @Override
  public Iterator<Integer> iterator() {
    return list.iterator();
  }
}
