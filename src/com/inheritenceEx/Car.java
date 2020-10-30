package com.inheritenceEx;
//parent class also called as super class
public  class Car {
    public String model;
    public Car(){
        System.out.println(" Car constructor...");
    }
    public Car(String m){
        System.out.println("model of the car is "+m);
    }
    public void start(){
        System.out.println("Car starts...");
    }

    public void stop(){
        System.out.println("Car stops...");
    }

}
