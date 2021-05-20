package com.adactin.properties;

import com.adactin.helper.Configuration_Reader;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {//constructor is private to avoid creating object in another class
		
	}
	public static File_Reader_Manager getInstance() {//File reader manager is return for helper
		
		File_Reader_Manager helper = new File_Reader_Manager();//object
		
		return helper;
	}

	public Configuration_Reader getInstanceCR() throws Throwable { // CR Configuration reader

		Configuration_Reader reader = new Configuration_Reader();

		return reader;

	}

}
