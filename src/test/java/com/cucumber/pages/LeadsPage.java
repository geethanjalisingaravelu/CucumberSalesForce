package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;

public class LeadsPage extends BasePage {

	
	public LeadsPage(WebDriver driver) {
	super(driver);
	addObject("Leads",By.xpath("//a[text()='Leads']"));
	addObject("LeadsHomePage",By.xpath("//h1[contains(text(),'Leads')]"));
	addObject("viewAllDropDown",By.xpath("//select[@id='fcf']/option"));
	addObject("viewDropDown",By.id("fcf"));
	addObject("actViewDropDown",By.name("fcf"));
	addObject("go",By.name("go"));
	addObject("todaysLeadsPage",By.id("00BgK00000IFsiU_listBody"));
	addObject("New",By.name("new"));
	addObject("leadsNewViewPage",By.xpath("//h2[contains(text(),'Singaravelu')]"));
	addObject("lastname",By.id("name_lastlea2"));
	addObject("company",By.id("lea3"));
	addObject("save",By.name("save"));
	
	
	
	
	}
}
