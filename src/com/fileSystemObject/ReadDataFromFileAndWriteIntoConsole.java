package com.fileSystemObject;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFileAndWriteIntoConsole {
    static FileInputStream fip;
    public static void main(String[] args) throws IOException {
        //FileInputStream fip;
        try {
             fip = new FileInputStream(".\\Files\\Tirupathi.txt");
            int data;
            while((data=fip.read())!=-1){
                System.out.print((char)data);
            }
        }catch(Throwable t ){

        }finally{
            fip.close();
        }
    }





}
