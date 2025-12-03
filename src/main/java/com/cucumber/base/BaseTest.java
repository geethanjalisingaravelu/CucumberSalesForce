package com.cucumber.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cucumber.utils.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected static WebDriver driver;
	PropertiesFile property = new PropertiesFile();
	
	public WebDriver launchApplication() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}
		//driver.get("https://orgfarm-0f6a7441c6-dev-ed.develop.my.salesforce.com/secur/frontdoor.jsp?sid=00DgK00000DgXGF!AQEAQD1JcqpZrwY83_k3qbkEqynJUCMQCLy5WFjPnGWXyqIgKM2t0D9gx5vmZIgNbiDgO5MAvPdj5KDh1lBuE_X0s0lLsd_e");
		driver.get(property.getProperty("url"));
		return driver;
	}

}
