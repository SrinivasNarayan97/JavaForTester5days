package com.reflectionAPIs;

public class TestForRef {

    public void openBrowser(){
        //selenium code to openBrowser
        try {
            System.out.println("OpenBrowser code");
            //write pass in to colume result
        }catch(Throwable t){
            //write FAil in to colume result
        }
    }

    public void Openurl(String url){
        System.out.println(" url ="+url);
    }

    public void login(String cn,String cp){
        System.out.println(cn+" password is "+cp);
    }

    public static void main(String[] args) {
        TestForRef rf=new TestForRef();
        String keyword="login"; //Excel
        String arg1="par1";
        String arg2="par2";

/*
        if(keyword.equals("OpenBrowser")){
            rf.openBrowser();
        }else if (keyword.equals("Openurl")){
            rf.Openurl(arg1);
        }else if(keyword.equals("login")){
            rf.login(arg1,arg2);
        }*/

    }
}
