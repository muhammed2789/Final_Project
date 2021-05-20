package com.maven.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_Page {
	public static WebDriver driver;
	@FindBy(xpath = "//a[@href='BookedItinerary.php']")
	private WebElement Bookings;
	@FindBy(name = "my_itinerary")
	private WebElement Itinerary;

	public Confirmation_Page(WebDriver driver) {
		Confirmation_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement ClickMyBookings() {
		return Bookings;
	}

	public WebElement ClickItinerary() {
		return Itinerary;
	}

}
