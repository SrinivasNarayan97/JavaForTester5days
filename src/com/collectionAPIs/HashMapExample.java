package com.collectionAPIs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //Map mp=new HashMap<>();
        Map mp=new LinkedHashMap();
        //new TreeMap();

        mp.put("cName","Synechron");
        mp.put("location","Bangalore");
        mp.put("country","India");

        /*System.out.println(mp.get("cName"));
        System.out.println(mp.get("location"));
        System.out.println(mp.get("country"));*/

        Set s = mp.keySet();
        for(Object x:s){
            System.out.println(x+"==="+mp.get(x));
        }
    }
}
