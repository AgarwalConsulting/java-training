package com.algogrit.java;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        House glassHouse = new GlassHouse();
        glassHouse.build();

        House concreteHouse = new GlassHouse();
        concreteHouse.build();
    }
}
