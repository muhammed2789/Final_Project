package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;
	@FindBy(name = "username")
	private WebElement Loginid;
	@FindBy(name = "password")
	private WebElement Password;
	@FindBy(name = "login")
	private WebElement Login;

	public Login_Page(WebDriver driver) {
		Login_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return Loginid;
	}

	public WebElement getpass() {
		return Password;

	}

	public WebElement clicklogin() {
		return Login;
	}
}
