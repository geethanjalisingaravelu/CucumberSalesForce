package com.cucumber.utils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	static FileInputStream fileInputStream;
	public String getProperty(String Key){
	
	String filepath ="Properties/application.properties";
		//2.Convert the path to object
		try {
			fileInputStream = new FileInputStream(filepath);
			 System.out.println("Success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3.Convert this file object to properties object
		
		Properties prop = new Properties();
		
			try {
				prop.load(fileInputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		String value = prop.getProperty(Key);
		return value;
}
}	
