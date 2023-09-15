package com.firstcry.tests;
import io.cucumber.testng.AbstractTestNGCucumberTests;


	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features = "Features",
			glue = "com.firstcry.tests",
			tags = "@Login_Functionality"
			)
	       
	public class TestRunner  extends AbstractTestNGCucumberTests{
	}



