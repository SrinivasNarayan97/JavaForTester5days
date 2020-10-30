package com.flowStatements;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class SwitchCaseEx {

    public static void main(String[] args) {
        System.out.println("Enter number " );
        Scanner s= new Scanner(System.in);
        int marks=s.nextInt();

        switch (marks)
        {
            case 0:
                System.out.println(" Entered value is zero");
                break;

            case 1:
                System.out.println("Entered number is one.");
                break;
            case 2:
                System.out.println("Entered number is two");
                break;
            default:
                System.out.println("Entered value is greater than 3");

        }
    }
}
