package com.fileSystemObject;

import java.util.StringTokenizer;

public class StringTockenizerExample {

    public static void main(String[] args) {
        String str="Bangalore is too cold now a days";
        StringTokenizer st= new StringTokenizer(str);
        //StringTokenizer st= new StringTokenizer(str,"a");
        //StringTokenizer st= new StringTokenizer(str,"a",true);

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
