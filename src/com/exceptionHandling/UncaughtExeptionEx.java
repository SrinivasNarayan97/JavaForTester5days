package com.exceptionHandling;

public class UncaughtExeptionEx {
    //uncaught Exception
    public static void main(String[] args)  {
        System.out.println("A");

        try {
            System.out.println(8 /0);
          System.out.println("try...block");
        }catch(Throwable t){
            System.out.println(t.getMessage());
            System.out.println("catch...block");
        }
        System.out.println("B");

    }
}
