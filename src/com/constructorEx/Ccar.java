package com.constructorEx;

public class Ccar {
    String model;
    int price;

    public Ccar(String model,int price){
            this.model=model;
            this.price=price;
    }

    public static void main(String[] args) {
        Ccar c=new Ccar("BMW",20000);
        System.out.println("model="+c.model);
        System.out.println("price="+c.price);

        Ccar d= new Ccar("SKoda",15000);
        System.out.println("model="+d.model);
        System.out.println("price="+d.price);

    }
}
// lunch break upto 2pm