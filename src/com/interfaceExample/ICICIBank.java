package com.interfaceExample;

public class ICICIBank implements RBI{

    public void MinBalanceForSaving(){
        System.out.println("1000");
    }

    public void MinBalanceForCurrent() {
        System.out.println("5000");
    }

    public void ROIForSaving(){
        System.out.println("5%");
    }
    public void internationalBanking(){
        System.out.println("This is spl feature in ICICI bank");
    }
}
