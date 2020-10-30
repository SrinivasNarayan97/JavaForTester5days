package com.fileSystemObject;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class WorkWithCSV {

    public static void main(String[] args) throws Throwable {

        CSVReader reader=new CSVReader(new FileReader(".\\Files\\TestDataForCSV.csv"));
        List<String[]> li = reader.readAll();
        System.out.println("Row count ="+li.size());
        String[] str = li.get(0);
        System.out.println("col count ="+str.length);

        for(String[] x: li ){

                for(int i=0;i<x.length;i++){
                    System.out.println(x[i]);
                }

        }

    }
}
