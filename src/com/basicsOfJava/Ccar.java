package com.basicsOfJava;

public class Ccar {

     String model;

    public static void main(String[] args) {
        int x=10;
        Ccar a= new Ccar();

        Ccar b= new Ccar();

        Ccar c= new Ccar();

        a.model="BMW";
        b.model="Skoda";
        c.model="Maruti";

        System.out.println(a.model);
        System.out.println(b.model);
        System.out.println(c.model);

        a = b;
        b = c;
        c = a;

        System.out.println(a.model);
        System.out.println(b.model);
        System.out.println(c.model);

    // Lunch break upto 2pm
    }
}
