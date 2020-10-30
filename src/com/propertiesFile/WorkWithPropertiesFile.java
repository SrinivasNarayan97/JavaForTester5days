package com.propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class WorkWithPropertiesFile {

    public static void main(String[] args) throws Throwable {
        Properties prop=new Properties();
        prop.load(new FileInputStream(".\\src\\com\\propertiesFile\\Global.Properties"));

        System.out.println(prop.getProperty("Browsertype"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("TestEnvi"));

        prop.setProperty("url","www.gmail.com");

        System.out.println(prop.getProperty("url"));

    }
}
//ctrl+alt+v