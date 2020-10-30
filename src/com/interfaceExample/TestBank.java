package com.interfaceExample;

public class TestBank {

    public static void main(String[] args) {
       // WebDriver driver= new ChromeDriver();
        // ChromeDriver driver= new ChromeDriver();
        RBI i= new ICICIBank();
        i.MinBalanceForSaving();
        i.MinBalanceForCurrent();
        i.ROIForSaving();
      //  i.internationalBanking();

        ICICIBank r=new ICICIBank();
        r = (ICICIBank) i;
        r.internationalBanking();

    }
}
