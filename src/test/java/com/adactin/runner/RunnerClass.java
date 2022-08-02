package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.stepdefinition.StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\adactin\\feature\\adactin.feature", 
glue ="com.adactin.stepdefinition", monochrome = true)


public class RunnerClass  {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
	//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"AdactinCucumber\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", 
				//"C:\\Users\\ADMIN\\eclipse-workspace-selvi\\AdactinCucumber\\Driver 103.0.5060.153\\chromedriver.exe");
		driver =Base_Class.browserLaunch("Chrome");

	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
