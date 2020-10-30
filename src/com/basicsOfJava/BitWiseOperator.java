package com.basicsOfJava;

public class BitWiseOperator {

    public static void main(String[] args) {
        System.out.println( true & true);
        System.out.println( true & false);
        System.out.println( false  & true);
        System.out.println( false & false);

        System.out.println( true | true);
        System.out.println( true | false);
        System.out.println( false  | true);
        System.out.println( false | false);

        System.out.println( 6 & 7);
        System.out.println( 6 | 7);
        System.out.println( 6 ^ 7);

        System.out.println(!true);
        System.out.println(~4);

    }
}
