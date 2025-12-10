package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;

public class RandomScenariosPage extends BasePage {
	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		
		addObject("topLeftUsername",By.xpath("//h1[@class='currentStatusUserName']"));
		addObject("allTabsArrow",By.xpath("//img[@class='allTabsArrow']"));
		addObject("customizeTabs",By.name("customize"));
		addObject("selectedTabs",By.id("duel_select_1"));
		addObject("removeArrow",By.xpath("//img[@title='Remove']"));
		addObject("save",By.name("save"));
		addObject("dateLink",By.xpath("//span[@class='pageDescription']/a"));
		addObject("timeLink",By.xpath("//a[contains(text(),'8:00 AM')]"));
		addObject("subCombo",By.xpath("//img[@class='comboboxIcon']"));
		addObject("selSubject",By.xpath("//a[contains(text(),'Other')]"));
		addObject("endTime",By.id("EndDateTime_time"));
		addObject("timeLink1",By.xpath("//a[contains(text(),'4:00 PM')]"));
		addObject("endTime1",By.xpath("//div[contains(text(),'9:30 PM')]"));
	

}
	
}


