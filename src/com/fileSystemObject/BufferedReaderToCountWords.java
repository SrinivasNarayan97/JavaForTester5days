package com.fileSystemObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderToCountWords {

    static FileReader fr;
    static StringTokenizer st;
    static BufferedReader br;
    static int count=0;

    public static void main(String[] args) throws IOException {
        try {
            fr = new FileReader(".\\Files\\Tirupathi.txt");
            br =new BufferedReader(fr);
                String data;
                while((data=br.readLine())!=null){
                    String readLine = data;

                        st=new StringTokenizer(readLine);
                            while(st.hasMoreTokens()){
                                System.out.println(st.nextToken());
                                count++;
                            }
                }
            System.out.println("Total number of words ="+count);
        }catch(Throwable t){

        }finally {
          fr.close();
          br.close();

        }

    }
}
// coffee Break upto 11am