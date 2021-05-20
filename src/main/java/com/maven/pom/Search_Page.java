package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {

	public static WebDriver driver;
	@FindBy(name = "location")
	private WebElement Locate;
	@FindBy(name = "hotels")
	private WebElement Hotels;
	@FindBy(name = "room_type")
	private WebElement Roomtype;
	@FindBy(name = "room_nos")
	private WebElement Noofrooms;
	@FindBy(name = "datepick_in")
	private WebElement Pickin;
	@FindBy(name = "datepick_out")
	private WebElement Pickout;
	@FindBy(id = "adult_room")
	private WebElement Aroom;
	@FindBy(id = "child_room")
	private WebElement Croom;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public Search_Page (WebDriver driver) {
		Search_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement selectlocation() {
		return Locate;
	}

	public WebElement selecthotels() {
		return Hotels;
	}

	public WebElement selectroomtype() {
		return Roomtype;
	}

	public WebElement getNoofrooms() {
		return Noofrooms;
	}

	public WebElement checkinDate() {
		return Pickin;
	}

	public WebElement checkoutDate() {
		return Pickout;
	}

	public WebElement selectAdultroom() {
		return Aroom;
	}

	public WebElement selectChildroom() {
		return Croom;
	}

	public WebElement clicksubmit() {
		return submit;
	}
}
