package com.collectionAPIs;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
       // HashSet s=new HashSet<>();
       // HashSet s=new LinkedHashSet();
        Set s=new TreeSet();
        s.add(11);
        s.add(-2);
        s.add(3);
        s.add(84);
        s.add(5);

        System.out.println("size="+s.size());
        System.out.println(s);
       // s.get()XXXXXXXXXXXXXXXX
        /*
        for(Object x: s){
            System.out.println(x);
        }
        */
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
