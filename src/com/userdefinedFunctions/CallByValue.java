package com.userdefinedFunctions;

public class CallByValue {

    int data=50;

    public void change(int data){

        data=data+100;
        System.out.println("addition="+data);
    }

    public static void main(String[] args) {
        CallByValue cbv=new CallByValue();

        System.out.println("before change="+cbv.data);
        cbv.change(500);
        System.out.println("after change="+cbv.data);
    }
}
