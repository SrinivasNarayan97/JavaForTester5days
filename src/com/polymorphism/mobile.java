package com.polymorphism;

public class mobile {

    public  void open(){
        System.out.println("Default way of opening mobile");
    }

    public void open(String pwd){
        System.out.println("opened mobile with string pwd "+pwd);
    }
    public void open(Object pwd){
        System.out.println("opened mobile with object value="+pwd);
    }
    public void open(int pwd){
        System.out.println("opened mobile with int pwd="+pwd);
    }

    public void open(String pwd1,String pwd2){
        System.out.println(pwd1+"-----"+pwd2);
    }

    public static void main(String[] args) {

        mobile m= new mobile();
       // m.open();
      //  m.open(3455);
        m.open("srinivas");
    }

}
// redesing method with same name with different datatypes and number of parameters we called as an method overloading.