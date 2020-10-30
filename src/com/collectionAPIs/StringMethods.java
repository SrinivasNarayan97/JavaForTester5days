package com.collectionAPIs;

public class StringMethods {

    public static void main(String[] args) {
        String str="Bangalore is too cold a now days...";

        //String str="         Bangalore is too cold now days...                 ";
        //String str="";
        System.out.println(str.length());
        System.out.println(str.equals("bangalore is too cold now days..."));
        System.out.println(str.equalsIgnoreCase("bangalore is too cold now days..."));
        System.out.println(str.isEmpty());
        System.out.println(str.contains("2"));
        System.out.println(str.replace("Bangalore","Pune"));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.replace(" ",""));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(str.substring(9));
        System.out.println(str.substring(0,9));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(str.indexOf("i"));
        System.out.println(str.charAt(10));
        System.out.println("---------------------------------------------------------------------------");
        String[] s = str.split(" ");
        for(String x: s){
            System.out.println(x);
        }
        System.out.println("---------------------------------------------------------------------------");

        String join = String.join(" ", s);
        System.out.println(join);


    }
}
