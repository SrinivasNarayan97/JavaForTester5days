package com.exceptionHandling;

public class FinallyBlockEx {

    public static void main(String[] args) {

        System.out.println("OpenDB");
        try{
            System.out.println("Execute query");
            System.out.println(8/0);
        }catch(Throwable t){
            System.out.println(4/0);
        }finally {
            System.out.println("CloesDB");
        }
    }
}
