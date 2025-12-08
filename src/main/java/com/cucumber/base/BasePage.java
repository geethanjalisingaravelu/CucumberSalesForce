package com.cucumber.base;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumber.utils.PropertiesFile;



public class BasePage  {
	
WebDriver driver;
static String oldTitle;
PropertiesFile prop = new PropertiesFile();
	
	HashMap<String,By> ObjectRepo = new HashMap<String,By>();
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addObject(String elementName, By by) {
		ObjectRepo.put(elementName, by);
	}
	
	public WebElement getElement(String elementName) {
		
		By by = ObjectRepo.get(elementName);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		WebElement element = driver.findElement(by);
		return element;
	}
	
	public List<WebElement> getElements(String elementName) {
	    By by = ObjectRepo.get(elementName);
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	    return driver.findElements(by);
	}
	
	public void enterintoTextBox(String elementName, String inputData) {
		WebElement element = getElement(elementName);
		waitForElement(element);
		element.clear();
		element.sendKeys(inputData);
	}
	
	
	public void clickButton(String elementName) {
		WebElement element = getElement(elementName);
		waitForElement(element);
		element.click();
	}
	

	
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void readandenterintoTextBox(String elementName, String propertyKey) {
		String inputValue = prop.getProperty(propertyKey);
		WebElement element = getElement(elementName);
		element.sendKeys(inputValue);
	}
	
	public void verifyText(String elementName,String ExpectedValue) {
		
		WebElement element = getElement(elementName);
		waitForElement(element);
		String ActualValue = element.getText();
		//String ExpectedValue = "Student Registration Form";
		Assert.assertEquals(ActualValue, ExpectedValue);
		
		
	}
	public void validatePage(String elementName) {
		
		WebElement element = getElement(elementName);
		waitForElement(element);
		if(element.isDisplayed())
			System.out.println(elementName+ " Page is displayed");
		else
			System.out.println(elementName+ " Page is not displayed");
		Assert.assertTrue(element.isDisplayed(), elementName+ " Page is not displayed");
	}
	
	
	
	public void validateDropdownOptions(String viewAllDropDown, String[] expectedOptions) {
	    List<WebElement> actualList = getElements(viewAllDropDown);

	    for (String expected : expectedOptions) {
	        boolean found = false;
	        for (WebElement actual : actualList) {
	            if (actual.getText().trim().equals(expected)) {
	                found = true;
	                System.out.println("PASSED → " + expected + " is displayed");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("FAILED → " + expected + " is NOT displayed");
	        }
	        Assert.assertTrue(found, expected + " was NOT found in the dropdown menu!");
	    }
	}
	
	
	
	public void selectDropDown(String valueToSelect, String  elementName) {
		boolean found = false;
		WebElement element = getElement(elementName);
		  Select option = new Select(element);
		  for (WebElement opt : option.getOptions()) {
			    if (opt.getText().equals(valueToSelect)) {
			        found = true;
			        break;
			    }
			}

			// If NOT found → add Reports
			if (found) {
				  option.selectByVisibleText(valueToSelect);

			}
		
	}
	
	public void verifySelectedValueFromDropDown(String expectedValue, String actualValue) {
		WebElement element = getElement(actualValue);
		  Select option = new Select(element);
		   String actual = option.getFirstSelectedOption().getText().trim();
		   System.out.println(actual);
		   Assert.assertEquals(actual, expectedValue);
		
	}
	
	public void verifyValueNotinDropDown(String elementName, String viewNameToCheckNotPresent) {
		WebElement element = getElement(elementName);
		Select select = new Select(element);

	    boolean exists = false;

	    for (WebElement option : select.getOptions()) {
	        if (option.getText().trim().equals(viewNameToCheckNotPresent.trim())) {
	            exists = true;
	            break;
	        }
	    }

	    Assert.assertFalse(
	        exists, 
	        "View '" + viewNameToCheckNotPresent + "' SHOULD NOT be present in dropdown!"
	    );
	}
	
	public void switchToAnotherWindow() {
		String parentWindow = driver.getWindowHandle();
		for(String window:driver.getWindowHandles()) {
			if (!window.equals(parentWindow)) {
			driver.switchTo().window(window);
			driver.close();;
		}
		}
		
		driver.switchTo().window(parentWindow);
	}
	public void switchToOtherWindow(String elementName) {
		
		String parentWindow = driver.getWindowHandle();
		for(String window:driver.getWindowHandles()) {
			if (!window.equals(parentWindow)) {
			driver.switchTo().window(window);
			WebElement element = getElement(elementName);
			element.click();
			
		}
		}
		driver.switchTo().window(parentWindow);
		
	}

	
	public void verifyNewWindowClosed() {

	    int windowCount = driver.getWindowHandles().size();

	    Assert.assertEquals(windowCount, 1,
	            "New window is NOT closed!");
	}
	
	public void verifyLogout() {
		System.out.println(driver.getCurrentUrl());
		boolean isLoggedOut = driver.getCurrentUrl().contains("my.salesforce.com");
		Assert.assertTrue(isLoggedOut, "FAIL → Login page NOT displayed after logout");
	}
	
	public void switchToIframe(String elementName) {
		
		WebElement element = getElement(elementName);
		waitForElement(element);
		driver.switchTo().frame(element);
	}
	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	public void mouseHoveraction(String elementName) {
		Actions action = new Actions(driver);
		WebElement element = getElement(elementName);  
	    action.moveToElement(element).build().perform();
	
		
	}
	public void mouseHoverClickaction(String elementName) {
		Actions action = new Actions(driver);
		WebElement element = getElement(elementName);  
	    action.moveToElement(element).click().build().perform();
	
		
	}
	
	public void windowsAlert() {
		driver.switchTo().alert().accept();
	}
	
	

	public void captureTitle() {
	    oldTitle = driver.getTitle();
	   // System.out.println(oldTitle);
	}

	public void verifyCurrentTitleMatchesOld() {
		//System.out.println(driver.getTitle());
		// System.out.println(oldTitle);
	    Assert.assertEquals(oldTitle, driver.getTitle());
	}
	

	
}
