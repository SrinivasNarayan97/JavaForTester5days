package com.ObjectStreaming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {
    static FileInputStream fip;
    static ObjectInputStream ois;

    public static void main(String[] args) throws IOException {
        try {
            fip = new FileInputStream(".\\Files\\emp.ser");
            ois=new ObjectInputStream(fip);
            Object o = ois.readObject();
            EmployeeInfo emp=( EmployeeInfo)o;
            System.out.println("Emp id ="+emp.empid);
            System.out.println("emp name ="+emp.name);
            System.out.println("login pwd="+emp.loginpwd);

        }catch(Throwable t){

        }finally {
            fip.close();
            ois.close();
            System.out.println("Done");
        }

    }
}
