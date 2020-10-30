package com.abstractionExample;
//parent class
public abstract class BMW {

    public void commonFeatures(){
        System.out.println("common features...");
    }

    public abstract void Enginepower();// Abstract method


    public static void main(String[] args) {
        System.out.println("Abstract class");

    }
}
