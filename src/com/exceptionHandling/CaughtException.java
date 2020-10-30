package com.exceptionHandling;

public class CaughtException {

    public static void main(String[] args) throws Throwable {
        System.out.println("A");
        Thread.sleep(2000);
        System.out.println("B");
        Thread.sleep(2000);
        System.out.println("C");
        Thread.sleep(2000);

    }
}
