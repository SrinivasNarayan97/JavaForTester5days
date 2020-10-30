package com.fileSystemObject;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws Throwable {
      //  File f= new File("D:/JavaProgram/Test.txt");
      //  File f= new File("D:/JavaProgram/Test.pdf");
      //  File f= new File("D:/JavaProgram/Test.xlsx");
        File f= new File("D:/JavaProgram/Test.png");

        f.createNewFile();
        System.out.println("Done");
    }
}
