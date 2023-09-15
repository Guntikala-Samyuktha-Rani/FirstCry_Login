package com.firstcry.pages;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	@FindBy(xpath="//span[contains(@class,'poplogin')]")
	private WebElement login;
	
	@FindBy(id="lemail")
	private WebElement EmailID;
	
	@FindBy(xpath="//div[contains(@class, 'B14_white comm-btn btn-login-continue btn-login-cont-otp')]")
	private WebElement Continue;
	
	@FindBy(xpath="//div[contains(@id,'verfiedbtn')]")
	private WebElement submitbtn;
	
	public LoginPage(WebDriver driver) {
   PageFactory.initElements(driver,this);
	}
	public void ClickLogin() {
		login.click();
	}
	public void enteremail(String email) {
		EmailID.sendKeys(email);
	}
	public void clickContinuebtn() {
		Continue.click();
	}
	
	public void clicksubmitbtn() {
		submitbtn.click();
	}
	
	}
	 
	    
	
    


