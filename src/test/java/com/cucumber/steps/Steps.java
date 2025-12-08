package com.cucumber.steps;



import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
	
	BasePage page;
	
	


	

	@Given("User launch the application")
	public void user_launch_the_application() {
	  driver = launchApplication();
	}
	
	@When("User enter into textbox {string} {string}")
	public void user_enter_into_textbox(String elementName, String inputValue) {
		
		page.enterintoTextBox(elementName, inputValue);
	  
	}
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		String packageName = "com.cucumber.pages";
		String fullPath = packageName+"."+pageName;
		try {
			//page = new LoginPage(driver); replacement of this line is below line
			page = (BasePage)Class.forName(fullPath).getDeclaredConstructor(WebDriver.class).newInstance(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	@Then("User Click on {string}")
	public void user_click_on(String elementName) {
	   page.clickButton(elementName);
	}
	
	@Then("User Click on Verify Button {string}")
	public void user_click_on_verify_button(String elementName) throws InterruptedException {
		Thread.sleep(20000);
	   page.clickButton(elementName);
	}
	
	@Then("User read the Data and enter the value to {string} {string}")
	public void user_read_the_data_and_enter_the_value_to(String elementName, String propertyKey) {
		
		page.readandenterintoTextBox(elementName, propertyKey);
	   
	}

	@Then("User Verify the text {string} {string}")
	public void user_verify_the_text(String elementName, String expectedValue) {
	
	page.verifyText(elementName, expectedValue);	
	}

	@Then("User verify the page {string}")
	public void user_verify_the_page(String elementName) {
	  page.validatePage(elementName); 
	}

	
	
	
	@Then("User validates the dropdown {string} with options")
	public void user_validates_the_dropdown_with_options(String elementName, io.cucumber.datatable.DataTable dataTable) {
		 List<String> expectedOptions = dataTable.asList(String.class);
		 page.validateDropdownOptions(elementName, expectedOptions.toArray(new String[0]));
	}
	
	@Then("User selects {string} from {string} dropdown")
	public void user_selects_from_dropdown(String selectValue, String elementName) {
	  page.selectDropDown(selectValue, elementName);
	}
	@Then("User Verify the text in DropDown {string} {string}")
	public void user_verify_the_text_in_drop_down(String expectedValue, String actualValue) {
	   page.verifySelectedValueFromDropDown(expectedValue,actualValue);
	}
	
	@Then("User Verify the text not in DropDown {string} {string}")
	public void user_verify_the_text_not_in_drop_down(String elementName, String viewNameToCheckNotPresent) {
	  page.verifyValueNotinDropDown(elementName,viewNameToCheckNotPresent);
	}
	
	@Then("User switches to the new window, closes it and switches back to the main window")
	public void user_switches_to_the_new_window_closes_it_and_switches_back_to_the_main_window() {
	   page.switchToAnotherWindow();
	}
	@Then("User verifies the new window is closed")
	public void user_verifies_the_new_window_is_closed() {
	  page.verifyNewWindowClosed();
	}
	
	@Then("User verifies logout and is redirected to Salesforce login page")
	public void user_verifies_logout_and_is_redirected_to_salesforce_login_page() {
	  page.verifyLogout();
	}
	
	@Then("Switch to Frame {string}")
	public void switch_to_frame(String elementName) {
		
	    page.switchToIframe(elementName);
	}



	@Then("Switch to Frame defaultcontent")
	public void switch_to_frame_defaultcontent() {
	   page.switchToDefaultContent();
	}


	@When("Move the mouse hover to {string}")
	public void move_the_mouse_hover_to(String elementName) {
	   page.mouseHoveraction(elementName);
	}

	@When("Move the mouse hover and click to {string}")
	public void move_the_mouse_hover_and_click_to(String elementName) {
	   page.mouseHoverClickaction(elementName);
	}
	
	@And ("sleep for 2000ms")
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	@And ("User switch to window alert and accept")
	public void user_switch_to_window_alert_and_accept() {
	   page.windowsAlert();
	}
	@And("User Capture Title and store in oldTitle")
	public void user_capture_title_and_store_in_old_title() {
	 page.captureTitle();
	}
	@Then("Verify current title matches oldTitle")
	public void verify_current_title_matches_old_title() {
	    page.verifyCurrentTitleMatchesOld();
	}

	@And("User switch to other window {string}")
	public void user_switch_to_other_window(String elementName) {
	  page.switchToOtherWindow(elementName);
	}



	
	@After
	public void teardown(Scenario scenario) {
		byte[] screenshot =null;
		screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
				
		driver.close();
		driver=null;
	}

}

