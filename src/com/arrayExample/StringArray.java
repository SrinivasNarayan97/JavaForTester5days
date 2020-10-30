package com.arrayExample;

public class StringArray {

    public static void main(String[] args) {
       String[] str =new String[4];

        str[0]="B";
        str[1]="C";
        str[2]="H";
        str[3]="P";

        //String[] str={"B","C","H","P"};

        System.out.println("size="+str.length);
        //System.out.println(str[2]);

        /*for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }*/
        for( String x: str){
            System.out.println(x);
        }



    }
}
