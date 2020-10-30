package com.debuggingExample;

public class Concat {


    public static void main(String[] args) {

        int x=30;
        int y=20;
        String str1="Hello";
        String str2="World";
        System.out.println(x+y);
        System.out.println(str1+str2);
        System.out.println(x+y+str1+str2);
        System.out.println(str1+str2+x+y);
        System.out.println(str1+str2+(x+y));
       Add2Num a= new Add2Num();
        a.sum(x, y);
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

    }
}
