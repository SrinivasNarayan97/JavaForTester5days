package com.fileSystemObject;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadDataFromFileAndWriteIntoFile {
    static FileInputStream fip;
    static FileOutputStream fop;

    public static void main(String[] args) throws IOException {
        try {
            fip = new FileInputStream(".\\Files\\Tirupathi.txt");
            fop= new FileOutputStream(".\\Files\\Tirupathi_copy.txt");
                int data;
                while((data=fip.read())!=-1){
                    fop.write(data);
                }

        }catch (Throwable t){

        }finally{
          fip.close();
          fop.close();
            System.out.println("Done");
        }


    }
}
