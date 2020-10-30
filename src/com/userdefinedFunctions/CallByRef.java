package com.userdefinedFunctions;

public class CallByRef {
    int data=50;

    public void change(CallByRef r){
        r.data=r.data+100;
        System.out.println("Addtion="+r.data);
    }


    public static void main(String[] args) {

        CallByRef cbr= new CallByRef();
        System.out.println("before change ="+cbr.data);
        cbr.change(cbr);
        System.out.println("after change ="+cbr.data);

    }
}
