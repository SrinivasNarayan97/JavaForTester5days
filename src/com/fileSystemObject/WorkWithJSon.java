package com.fileSystemObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class WorkWithJSon {

    public static void main(String[] args) throws Throwable {
        
        JSONParser parser= new JSONParser();
        Object obj = parser.parse(new FileReader(".\\Files\\TestData.json"));
        JSONObject jobj=(JSONObject)obj;

        Object arrayobject = jobj.get("Createcredentials");
       // System.out.println(arrayobject);
        JSONArray jarrayobject=(JSONArray)arrayobject;
        System.out.println(jarrayobject.size());

        for(Object x: jarrayobject ){
            JSONObject jo=(JSONObject)x;
            System.out.println(jo.get("cname"));
            System.out.println(jo.get("cpwd"));
        }
    }
}
//Coffee break upto 4.05pm
