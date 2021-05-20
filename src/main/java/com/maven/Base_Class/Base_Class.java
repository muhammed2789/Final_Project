package com.maven.Base_Class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;

	public static WebDriver BrowserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\eclipse project\\Selenium_Main_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("invalid");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void Moveto(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void Actionclick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}

	public static void Frame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void TakeScreenshot(String str) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File(str);
		FileUtils.copyFile(Source, Destination);		
	}
	
	public static void Wait( String str, int a) {
		WebDriverWait wait = new WebDriverWait(driver, a);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(str)));
	}
	public static void ExplicitWait (WebElement element,int a) {
		WebDriverWait wait = new WebDriverWait(driver, a);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void Selectvalue(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByValue(str);
	}

	public static void openUrl(String url) {
		driver.get(url);
	}

	public static void ClickOnElement(WebElement element) {
		element.click();
	}

	public static void inputValues(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void GetText(WebElement element) {
		element.getText();
	}

	public static void Clr(WebElement element) {
		element.clear();
	}
	
	public static void Sleep(int time) throws Exception {
		Thread.sleep(time);
	}

}
