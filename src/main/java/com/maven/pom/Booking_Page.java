package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	public static WebDriver driver;
	@FindBy(name="first_name")
	private WebElement FsN;
	@FindBy(name="last_name")
	private WebElement LsN;
	@FindBy(id="address")
	private WebElement Ads;
	@FindBy(id="cc_num")
	private WebElement Credit;
	@FindBy(name="cc_type")
	private WebElement CCType;
	@FindBy(name="cc_exp_month")
	private WebElement ExpMonth;
	@FindBy(name="cc_exp_year")
	private WebElement ExpYear;
	@FindBy(id="cc_cvv")
	private WebElement Cvv;
	@FindBy(name="book_now")
	private WebElement Booknow;
	
	public Booking_Page(WebDriver driver) {
		Booking_Page.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFsname() {
		return FsN;
	}
	public WebElement getLsname() {
		return LsN;
	}
	public WebElement getads() {
		return Ads;
	}
	public WebElement getCredit() {
		return Credit;
	}
	public WebElement getCCtype() {
		return CCType;
	}
	public WebElement getExpmonth() {
		return ExpMonth;
	}
	public WebElement getExpYear() {
		return ExpYear;
	}
	public WebElement getCvv() {
		return Cvv;
	}
	public WebElement ClickBkN() {
		return Booknow;
	}
}
