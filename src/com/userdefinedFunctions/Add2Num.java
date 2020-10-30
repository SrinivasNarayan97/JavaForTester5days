package com.userdefinedFunctions;

public class Add2Num {


    public static void main(String[] args) {
        Test1 t=new Test1(); // Has a relation
        t.login();



      //  Test1.login();
        int a=10;
        int b=20;

        System.out.println("A");
        int c=sum(a,b)+50;

        System.out.println("Total sum="+c);
        System.out.println("B");
    }

    public static int sum(int x, int y){
       // int z= x +y ;
        //System.out.println("sum="+z);
        return x+y;

    }
}
