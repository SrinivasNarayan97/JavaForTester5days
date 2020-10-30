package com.collectionAPIs;

import java.util.ArrayList;
import java.util.List;

public class OneMoreArrayList {
    public static void main(String[] args) {
        long starttime=System.currentTimeMillis();
      List<Integer> ar1=new ArrayList<>();

        for(int i=10;i<=100;i=i+10){
            ar1.add(i);
        }

        System.out.println(ar1);

        ar1.add(2,33);
        System.out.println(ar1);
        ar1.remove(2);
        System.out.println(ar1);

        ArrayList<Integer> ar2=new ArrayList();
        ar2.add(11);
        ar2.add(22);
        ar2.add(33);

        //ar1.addAll(ar2);
        ar1.addAll(2,ar2);
        System.out.println(ar1);
        long endtime=System.currentTimeMillis();
        System.out.println("Total time="+(endtime-starttime));
    }
}
