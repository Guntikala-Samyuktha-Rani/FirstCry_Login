package com.firstcry.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TestBase {

	public static WebDriver driver;
	public static void getBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		
	}
	
}