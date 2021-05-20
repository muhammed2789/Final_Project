package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.maven.pom.Booking_Page;
import com.maven.pom.Confirmation_Page;
import com.maven.pom.Login_Page;
import com.maven.pom.Search_Page;
import com.maven.pom.Select_Page;
public class Page_Object_Manager {
	public static WebDriver driver;
	private Login_Page li;
	private Search_Page sep;
	private  Select_Page sp;
	private Booking_Page bp;
	private Confirmation_Page cp;
	
	
	public Page_Object_Manager(WebDriver driver2) {   //automatically created from step definition
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public Login_Page getInstanceLogin() {
		li= new Login_Page(driver);	
		return li;
	}
	
	public Search_Page getInstanceSearch() {
		sep = new Search_Page(driver);
		return sep;
	}
	
	public Select_Page getInstanceSelect() {
		sp = new Select_Page(driver);
		return sp;		
	}
	public Booking_Page getInstanceBooking() {
		bp = new Booking_Page(driver);
		return bp;
	}
	public Confirmation_Page getInstanceConfirm() {
		cp = new Confirmation_Page(driver);
		return cp;
	}

}
