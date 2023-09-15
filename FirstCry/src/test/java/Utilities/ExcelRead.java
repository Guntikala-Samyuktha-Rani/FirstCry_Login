package Utilities;

import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelRead {

    HSSFWorkbook file;
    HSSFSheet s;

    public List<String> readEmails(String path, String sheetName) throws Exception {
        FileInputStream fin = new FileInputStream(path);
        file = new HSSFWorkbook(fin);
        s = file.getSheet(sheetName);

        int lastRow = s.getLastRowNum();
        List<String> emails = new ArrayList<>();

        for (int i = 0; i <= lastRow; i++) {
            HSSFRow row = s.getRow(i);
            if (row != null) {
                Cell cell = row.getCell(0); // Assuming email is in the first column (column 0)
                if (cell != null && cell.getCellType() == CellType.STRING) {
                    String email = cell.getStringCellValue().trim();
                    if (!email.isEmpty()) {
                        emails.add(email);
                    }
                }
            }
        }

        return emails;
    }

    public static void main(String args[]) throws Exception {
        ExcelRead e = new ExcelRead();
        List<String> emailList = e.readEmails("C:\\Users\\hp\\Downloads\\TestData.xls", "Sheet1");

        if (!emailList.isEmpty()) {
            System.out.println("Emails:");
            for (String email : emailList) {
                System.out.println(email);
            }
        } else {
            System.out.println("No email addresses found in the Excel sheet.");
        }
    }
}
