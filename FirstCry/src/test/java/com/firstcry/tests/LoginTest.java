package com.firstcry.tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import com.firstcry.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	
private WebDriver driver;
private LoginPage loginPage;

@Given("user is on the FirstCry website")
public void user_is_on_the_first_cry_website() {
	driver = new ChromeDriver();
    driver.get("https://www.firstcry.com");
    loginPage = new LoginPage(driver);
}

@When("user click on the login button")
public void user_click_on_the_login_button() {
	loginPage.ClickLogin();
}

@When("user enter my email")
public void user_enter_my_email(String email) {
	loginPage.enteremail(email);
}

@When("user click on the continue button")
public void user_click_on_the_continue_button() throws InterruptedException {
	Thread.sleep(2000);
	loginPage.clickContinuebtn();
}

@When("user manually enter the OTP")
public void user_manually_enter_the_otp() throws InterruptedException {
	Thread.sleep(30000);
   
}

@When("user click the submit button")
public void user_click_the_submit_button() {
	loginPage.clicksubmitbtn();
}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully() {
	driver.quit();
}
}
