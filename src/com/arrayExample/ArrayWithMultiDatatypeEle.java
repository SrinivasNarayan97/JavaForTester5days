package com.arrayExample;

public class ArrayWithMultiDatatypeEle {

    public static void main(String[] args) {
        Object obj[]=new Object[4];

        obj[0]="Bangalore";
        obj[1]=23;
        obj[2]=true;
        obj[3]=23.44;

        System.out.println("size="+obj.length);
        /*for(int i=0;i<obj.length;i++){
            System.out.println(obj[i]);
        }*/

        for(Object x: obj){
            System.out.println(x);
        }

    }
}
