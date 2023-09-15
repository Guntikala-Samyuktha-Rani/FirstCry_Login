package com.firstcry.tests;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.firstcry.pages.LoginPage;
import Utilities.ExcelRead;


public class LoginTest1 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.firstcry.com/");

        ExcelRead excelReader = new ExcelRead();
        List<String> emailList = excelReader.readEmails("C:\\Users\\hp\\Downloads\\TestData.xls", "Sheet1");

        if (!emailList.isEmpty()) {
            for (String email : emailList) {
                System.out.println("Logging in with email: " + email);

                LoginPage loginPage = new LoginPage(driver);
                loginPage.ClickLogin();
                loginPage.enteremail(email);
                Thread.sleep(2000);
                loginPage.clickContinuebtn();
                Thread.sleep(30000);
                loginPage.clicksubmitbtn();
            }
        } else {
            System.out.println("No email addresses found in the Excel sheet.");
        }

        driver.quit();
    }
}



