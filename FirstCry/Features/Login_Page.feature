Feature: FirstCry Login Automation

@Login_Functionality
Scenario: Login to FirstCry
Given user is on the FirstCry website
When user click on the login button
And user enter my email 
And user click on the continue button
And user manually enter the OTP
And user click the submit button
Then user should be logged in successfully
