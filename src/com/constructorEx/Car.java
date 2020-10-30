package com.constructorEx;

public class Car {
    //Default Constructor
    public Car(){

        System.out.println("This is Car constructor ");
    }
    //parameterized constructor
    public Car(String model){

        System.out.println("model of the car is "+model);
    }

    public Car(int price){

        System.out.println("price="+price);
    }

    public Car(String model,int price){
        //new Car(20000);
        this(20000);

        System.out.println("model of the car is "+model+" its price is "+price);

    }

    public static void main(String[] args) {
           // new Car();
       // new Car("BMW");
        new Car("BMW",20000);

    }
}

//Rule1: Constructor should not be static
//Rule2: Constructor should not have return type