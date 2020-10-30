package com.collectionAPIs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {

    public static void main(String[] args) {
        Hashtable ht=new Hashtable<>();

        ht.put("cName","Synechron");
        ht.put("pincode",560001);
        ht.put("location","Pune");
        ht.put("country","India");


       /* System.out.println(ht.get("cName"));
        System.out.println(ht.get("location"));
        System.out.println(ht.get("country"));*/

        Enumeration k = ht.keys();
        Enumeration e = ht.elements();
        while(e.hasMoreElements()){
            System.out.println(k.nextElement() +"==="+e.nextElement());
        }
    }
}
