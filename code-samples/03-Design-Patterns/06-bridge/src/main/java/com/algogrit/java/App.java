package com.algogrit.java;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        Vehicle dieselCar = new Car(new DieselEngine());

        dieselCar.runsOn();
    }
}
