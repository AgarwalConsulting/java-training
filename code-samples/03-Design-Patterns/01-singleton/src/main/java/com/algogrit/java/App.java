package com.algogrit.java;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // printerDriver.print("Hello World!");

        System.out.println("Creating instance...");
        PrinterDriver printerDriver1 = PrinterDriver.getInstance();

        System.out.println("Fetching instance...");
        PrinterDriver printerDriver2 = PrinterDriver.getInstance();

        // ThreadSafeLazyLoadedIvoryTower ivoryTower = new ThreadSafeLazyLoadedIvoryTower();

        // printerDriver.print("Hello World!");

        System.out.println(PrinterDriver.class);

        System.out.println("Hello world!");
    }
}
