package com.collectionAPIs;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QuequeExample {

    public static void main(String[] args) {
        Queue q=new PriorityQueue<>();

        for(int i=11;i<=20;i++){
            q.offer(i);
        }

        System.out.println(q);
        Iterator it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
