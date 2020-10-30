package com.fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageAndCreatenew {

    static FileInputStream fip;
    static FileOutputStream fos;

    public static void main(String[] args) throws IOException {

        try {
            fip = new FileInputStream(".\\Files\\Sharada.jpg");
            fos = new FileOutputStream(".\\Files\\Sharada_copy.png");
            int data;
            while((data=fip.read())!=-1){
                fos.write(data);
            }

        }catch(Throwable t){

        }finally{

            fip.close();
            fos.close();
            System.out.println("Done");
        }
    }

}
