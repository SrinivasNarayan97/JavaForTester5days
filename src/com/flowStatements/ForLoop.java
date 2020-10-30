package com.flowStatements;

public class ForLoop {

    public static void main(String[] args) {

        /*for(int i=0;i<=10;i++){
            System.out.println(i);
        }*/

        /*for(int i=0;i<=10;i=i+2){
            System.out.println(i);
        }*/

        for(int i=0;i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);

        }
    }
}
