package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Registration_Page {
	public static WebDriver driver;

	@FindBy(xpath = "(//a[@href='Register.php'])")
	private WebElement Register;
	@FindBy(name = "username")
	private WebElement Username;
	@FindBy(id = "password")
	private WebElement Password;
	@FindBy(name = "re_password")
	private WebElement ConPass;
	@FindBy(id = "full_name")
	private WebElement Name;
	@FindBy(name = "email_add")
	private WebElement Email;
	@FindBy(name = "captcha")
	private WebElement Captcha;
	@FindBy(id = "tnc_box")
	private WebElement Terms;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Submit;

	public User_Registration_Page(WebDriver driver) {
		User_Registration_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement toclickregister() {
		return Register;
	}

	public WebElement togetusername() {
		return Username;
	}

	public WebElement togetpassword() {
		return Password;
	}

	public WebElement getconfirmpwd() {
		return ConPass;
	}

	public WebElement getname() {
		return Name;
	}

	public WebElement getmail() {
		return Email;
	}

	public WebElement getcaptcha() {
		return Captcha;
	}

	public WebElement getterms() {
		return Terms;
	}

	public WebElement submit() {
		return Submit;
	}
}
