package com.encapsulation;

public class MyAccount {

   private String fname;
    private String lname;
    private int Accountnum;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        //validation
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getAccountBalance() {
        return Accountnum;
    }

    public void setAccountBalance(int accountnum) {
        Accountnum = Accountnum;
    }



}
