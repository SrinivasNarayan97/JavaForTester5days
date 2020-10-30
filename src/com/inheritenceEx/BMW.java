package com.inheritenceEx;
//child class : subclass
public class BMW extends Car {

    public BMW(){
        //new Car("Skoda");
        super("skoda");
        super.model="BMW";

        // super("Maruti");
       /* Car c=  new Car();
        c.model="BMW";*/
        System.out.println("BMW constrctor...");

    }

    public void start(){


        System.out.println("BMW has its own way starting a car...");
    }

    public void theftsafty(){


        System.out.println("This a spl feature in BMW");
    }


}
