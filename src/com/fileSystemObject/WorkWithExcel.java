package com.fileSystemObject;

import xls.ShineXlsReader;

public class WorkWithExcel {

    public static void main(String[] args) {

        ShineXlsReader xls=new ShineXlsReader(".\\Files\\TestData.xlsx");
        int rowCount = xls.getRowCount("Sheet1");
        int columnCount = xls.getColumnCount("Sheet1");
        System.out.println("Row count="+rowCount);
        System.out.println("col count="+columnCount);

        xls.addSheet("Sheet4");
        xls.addColumn("Sheet4","EmpName");
        xls.setCellData("Sheet4","EmpName",2,"SrinivasNarayan");
        System.out.println("Done");
        /*for(int i=2;i<=rowCount;i++){
            for(int j=0;j<columnCount;j++){
                String cellData = xls.getCellData("Sheet1", j, i);
                System.out.println(cellData);
            }

        }
*/

    }
}
