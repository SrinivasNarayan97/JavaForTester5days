package com.staticExample;

public class Car {

    String model;
    int p;
    static int wheels=4;

    public void testFotStatic(){

        System.out.println("Test for static");

    }

    public static void main(String[] args) {

        System.out.println("wheels="+wheels);
        //testFotStatic();
       // System.out.println("model="+model);
        Car c=new Car();
        c.testFotStatic();
        System.out.println(c.model);

    }
}
// coffee break upto 11am