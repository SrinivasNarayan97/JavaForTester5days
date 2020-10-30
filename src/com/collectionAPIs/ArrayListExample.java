package com.collectionAPIs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {


    public static void main(String[] args) {
       // ArrayList<String> li= new ArrayList<String>();
        List<String> li= new ArrayList();
        li.add("B");
        li.add("C");
        li.add("H");
        li.add("P");
        li.add("B");
        li.add("C");




        int size = li.size();
        System.out.println("size="+size);
        //hot key for collecting return datatype --->ctl+alt+v
       // System.out.println(li.get(2));
       /* for(int i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }*/
       /* for(String x: li ){
            System.out.println(x);
        }*/
        Iterator<String> it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       /* it.next();
        it.next();
        System.out.println(it.next());*/
      /*  System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/
    }
}
