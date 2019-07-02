package com.algogrit.java;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        IntegerBox box = new IntegerBox();

        for (int i = 0; i < 10; i++) {
              box.add(i);
        }
        for (Integer value : box) {
            System.out.println(value);
        }
    }
}
