package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.Final_Project.Test_Runner;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.properties.File_Reader_Manager;
import com.maven.Base_Class.Base_Class;
import com.maven.pom.Booking_Page;
import com.maven.pom.Confirmation_Page;
import com.maven.pom.Login_Page;
import com.maven.pom.Search_Page;
import com.maven.pom.Select_Page;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom =new  Page_Object_Manager (driver);
//	public static Login_Page li = new Login_Page(driver);
//	public static Search_Page sep = new Search_Page(driver);
//	public static Select_Page sp = new Select_Page(driver);
//	public static Booking_Page bp = new Booking_Page(driver);
//	public static Confirmation_Page cp = new Confirmation_Page(driver);
	
	@Before(order=1)
	public static void beforeHooks() {
		System.out.println("Before Scenario");
	}
	@Before//----->default order will be Zero(0)
	public static void BeforeHooks1() {
		System.out.println("Before Scenario");
		
	}
	@After
	public static void afterHooks(Scenario a) throws Throwable {
		a.getStatus();//----> get status of scenario
		a.isFailed(); //------->
		if(a.isFailed()) {
			TakeScreenshot("//Path");
		}
	}
		// TODO Auto-generated method stub

	@Given("^user Launch The Application$")      //snippets ( which are methods )
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		openUrl(url);
	}

	@When("^user Enter \"([^\"]*)\" In Username Field$")
	public void user_Enter_In_Username_Field(String username) throws Throwable {
	
		inputValues(pom.getInstanceLogin().getUsername(), username);
	}

	@When("^user Enter \"([^\"]*)\" In Password Field$")
	public void user_Enter_In_Password_Field(String password) throws Throwable {
	inputValues(pom.getInstanceLogin().getpass(), password);
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		ClickOnElement(pom.getInstanceLogin().clicklogin());
	}

	@When("^user Select The Location Of Hotel$")
	public void user_Select_The_Location_Of_Hotel() throws Throwable {
		String loc = File_Reader_Manager.getInstance().getInstanceCR().getLoc();
		Selectvalue(pom.getInstanceSearch().selectlocation(),loc );
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		String hotel = File_Reader_Manager.getInstance().getInstanceCR().getHotel();
		Selectvalue(pom.getInstanceSearch().selecthotels(),hotel);
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		String R = File_Reader_Manager.getInstance().getInstanceCR().getRoomtype();
		Selectvalue(pom.getInstanceSearch().selectroomtype(),R);
	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
		String nroom = File_Reader_Manager.getInstance().getInstanceCR().getNroom();
		Selectvalue(pom.getInstanceSearch().getNoofrooms(),nroom);
	}

	@When("^user Enter The Check-In Date In The Field$")
	public void user_Enter_The_Check_In_Date_In_The_Field() throws Throwable {
		String cid = File_Reader_Manager.getInstance().getInstanceCR().getCID();
		Clr(pom.getInstanceSearch().checkinDate());
		inputValues(pom.getInstanceSearch().checkinDate(),cid);
	}

	@When("^user Enter The Check-Out Date In The Field$")
	public void user_Enter_The_Check_Out_Date_In_The_Field() throws Throwable {
		String cod = File_Reader_Manager.getInstance().getInstanceCR().getCOD();
		Clr(pom.getInstanceSearch().checkoutDate());
		inputValues(pom.getInstanceSearch().checkoutDate(),cod);
	}

	@When("^user Select The Number Of Rooms For Adult$")
	public void user_Select_The_Number_Of_Rooms_For_Adult() throws Throwable {
		String adult = File_Reader_Manager.getInstance().getInstanceCR().getAdult();
		Selectvalue(pom.getInstanceSearch().selectAdultroom(),adult);
	}

	@When("^user Select The Number Of Rooms For Child$")
	public void user_Select_The_Number_Of_Rooms_For_Child() throws Throwable {
		String child = File_Reader_Manager.getInstance().getInstanceCR().getChild();
		Selectvalue(pom.getInstanceSearch().selectChildroom(), child);
	}

	@Then("^user Click The Search Button And It Navigates To Select Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Page() throws Throwable {
		ClickOnElement(pom.getInstanceSearch().clicksubmit());
	}

	@When("^user Confirm The Selected Hotel$")
	public void user_Confirm_The_Selected_Hotel() throws Throwable {
		Moveto(pom.getInstanceSelect().CheckRadio());
		ClickOnElement(pom.getInstanceSelect().CheckRadio());
	}

	@Then("^user Click On Continue Button And Navigates To Book A Hotel Page$")
	public void user_Click_On_Continue_Button_And_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		ClickOnElement(pom.getInstanceSelect().clickcontinue());
	}

	@When("^user Enter The FirstName In Desired Field$")
	public void user_Enter_The_FirstName_In_Desired_Field() throws Throwable {
	String fn = File_Reader_Manager.getInstance().getInstanceCR().getFn();
		inputValues(pom.getInstanceBooking().getFsname(),fn);
	}

	@When("^user Enter The LastName In Desired Field$")
	public void user_Enter_The_LastName_In_Desired_Field() throws Throwable {
		String ln = File_Reader_Manager.getInstance().getInstanceCR().getLn();
		inputValues(pom.getInstanceBooking().getLsname(),ln);
	}

	@When("^user Enter The Address$")
	public void user_Enter_The_Address() throws Throwable {
		String add = File_Reader_Manager.getInstance().getInstanceCR().getAdd();
		inputValues(pom.getInstanceBooking().getads(), add);
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		String cc = File_Reader_Manager.getInstance().getInstanceCR().getCc();
		inputValues(pom.getInstanceBooking().getCredit(),cc);
	}
	
	@When("^user Select Cc Type$")
	public void user_Select_Cc_Type() throws Throwable {
		String ccType = File_Reader_Manager.getInstance().getInstanceCR().getCcType();
		Selectvalue(pom.getInstanceBooking().getCCtype(),ccType);
	}


	@When("^user Select the Expiry Month Of Cc$")
	public void user_Select_the_Expiry_Month_Of_Cc() throws Throwable {
		String expM = File_Reader_Manager.getInstance().getInstanceCR().getExpM();
		Selectvalue(pom.getInstanceBooking().getExpmonth(), expM );
	}

	@When("^user Select the Expiry Year Of CC$")
	public void user_Select_the_Expiry_Year_Of_CC() throws Throwable {
		String expY = File_Reader_Manager.getInstance().getInstanceCR().getExpY();
		Selectvalue(pom.getInstanceBooking().getExpYear(), expY);
	}

	@When("^user Enter The Cvv Number$")
	public void user_Enter_The_Cvv_Number() throws Throwable {
		String cvv = File_Reader_Manager.getInstance().getInstanceCR().getCvv();
		inputValues(pom.getInstanceBooking().getCvv(), cvv);
	}
	@Then("^user Click On BookNow Button And Navigates To Confirmation Page$")
	public void user_Click_On_BookNow_Button_And_Navigates_To_Confirmation_Page() throws Throwable {
		ClickOnElement(pom.getInstanceBooking().ClickBkN());
		Thread.sleep(7000);
	}
	@When("^user Click On Booked Itinerary Navigates To Bookings Page$")
	public void user_Click_On_Booked_Itinerary_Navigates_To_Bookings_Page() throws Throwable {
		ClickOnElement(pom.getInstanceConfirm().ClickMyBookings());
		}
	
	}

