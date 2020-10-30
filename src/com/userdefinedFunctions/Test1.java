package com.userdefinedFunctions;

 public class Test1 {

    String m;
    int p;

    //Function defination
    public  void login() {

        //selenium code to login
        System.out.println("Login statements");

    }

    public static void main(String[] args) {

        System.out.println("A");
       // login(); //Function call
        System.out.println("B");
       // login();
        System.out.println("C");
        //login();
        System.out.println("D");
       Test1 t= new Test1();
        t.login();



    };

}
