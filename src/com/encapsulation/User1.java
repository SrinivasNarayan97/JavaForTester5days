package com.encapsulation;

public class User1 {

    public static void main(String[] args) {

        MyAccount ma=new MyAccount();
        ma.setFname("srinivas");
        ma.setLname("Narayan");
        ma.setAccountBalance(1234567);


        System.out.println("First name :"+ma.getFname());
        System.out.println("Last name:"+ma.getLname());
        System.out.println("Account num:"+ma.getAccountBalance());

    }
}
