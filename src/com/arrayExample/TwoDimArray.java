package com.arrayExample;

public class TwoDimArray {

    public static void main(String[] args) {
        /*Object obj[][]=new Object[3][2];

        obj[0][0]="Name1";
        obj[0][1]="pwd1";

        obj[1][0]="Name2";
        obj[1][1]="pwd2";

        obj[2][0]="Name3";
        obj[2][1]="pwd3";*/
        Object obj[][]={{"Name1","pwd1"},{"Name2","pwd2"},{"Name3","pwd3"}};

        System.out.println("Row count="+obj.length);
        System.out.println("col count="+obj[2].length);

        for(int i=0;i<obj.length;i++){
            for(int j=0;j<obj[0].length;j++){
                System.out.println(obj[i][j]);
            }
        }

    }
}
