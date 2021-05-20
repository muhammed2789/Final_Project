package com.adactin.Final_Project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.File_Reader_Manager;
import com.maven.Base_Class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//feature",
glue="com.adactin.stepdefinition",
monochrome=true,
dryRun=false,
plugin= {"html:Reports/HtmlAdactin_Report" ,
//		
   "pretty",
//
"json:Report/jsonAdactin_Report.json" 
//,"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/Extentcucumber.html"
}
)//feature- feature file path //glue-step definition path

public class Test_Runner extends Base_Class {
	public static WebDriver driver;
		
@BeforeClass	
public static void set_Up() throws Throwable {
	String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();//return type
	driver = Base_Class.BrowserLaunch(browser);
	}
@AfterClass
public static void tearDown() throws Throwable {
	
	TakeScreenshot("D:\\workspace\\Final_Project\\Screenshot\\Adactin.png");
	driver.close();
	
}	

}

