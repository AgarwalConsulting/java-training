package com.algogrit.java;

/**
* Hello world!
*
*/
public class App {
    public static void main(String[] args) {
        EngineerFactory engineerFactory = new CivilEngineerFactory();

        Engineer engineer = engineerFactory.getEngineer();
        engineer.work();
    }
}
