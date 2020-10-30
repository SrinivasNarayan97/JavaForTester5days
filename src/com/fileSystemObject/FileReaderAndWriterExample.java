package com.fileSystemObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriterExample {
    static FileReader fr;
    static FileWriter fw;

    public static void main(String[] args) throws IOException {
        try {
            fr = new FileReader(".\\Files\\Payment.pdf");
            fw=  new FileWriter(".\\Files\\Payment_copy.pdf");

            int data;
            while((data=fr.read())!=-1){
                fw.write(data);
            }

        }catch (Throwable t){

        }finally {
            fr.close();
            fw.close();
        }

    }
}
