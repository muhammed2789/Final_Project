package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;	
	public Configuration_Reader() throws Throwable {  //constructor
	
		//converting properties in to file
		File f = new File("D:\\workspace\\Final_Project\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);//data from file
		
		 p = new Properties();
		
		p.load(fis);//load input stream to be selected
		
			}

	public String getBrowser() {
		String browser = p.getProperty("browser");//return type
		return browser;

	}
	public String getUrl() {
	
	String url = p.getProperty("url");
	return url;
}
	public String getCvv() {
		String Cvv = p.getProperty("Cvv");
		return Cvv;
	}
	
	public String getLoc() {
		String Location = p.getProperty("Location");
		return Location;
	}
	public String getHotel() {
		String Hotel = p.getProperty("Hotel");
		return Hotel;
	}
	public String getRoomtype() {
		String Room = p.getProperty("Roomtype");
		return Room;
	}
	public String getNroom() {
		String Rooms = p.getProperty("NRooms");
		return Rooms;
	}
	public String getCID() {
		String Checkin = p.getProperty("CID");
		return Checkin;
	}
	public String getCOD() {
		String Checkout = p.getProperty("COD");
		return Checkout;
	}
	public String getAdult() {
		String Apr = p.getProperty("Ar");
		return Apr;
	}
	public String getChild() {
		String Cpr = p.getProperty("Cr");
		return Cpr;
	}
	public String getFn() {
		String Fn = p.getProperty("Fn");
		return Fn;
	}
	public String getLn() {
		String Ln = p.getProperty("Ln");
		return Ln;
	}
	public String getAdd() {
		String Address = p.getProperty("Add");
		return Address;
	}
	public String getCc() {
		String CC = p.getProperty("Cc");
		return CC;
	}
	public String getCcType() {
		String CCT = p.getProperty("CcType");
		return CCT;
	}
	public String getExpM() {
		String EM = p.getProperty("Em");
		return EM;
	}
	public String getExpY() {
		String EY = p.getProperty("Ey");
		return EY;
	}
}

