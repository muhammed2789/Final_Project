package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	public static WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement Radio;
	@FindBy(id = "continue")
	private WebElement Continue;

	public Select_Page (WebDriver driver) {
		Select_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement CheckRadio() {
		return Radio;
	}

	public WebElement clickcontinue() {
		return Continue;
}
}
