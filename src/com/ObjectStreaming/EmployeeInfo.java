package com.ObjectStreaming;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {

    int empid;
    String name;
    transient int loginpwd;

    EmployeeInfo(int empid,String name,int loginpwd){
        this.empid=empid;
        this.name=name;
        this.loginpwd=loginpwd;

    }
}
