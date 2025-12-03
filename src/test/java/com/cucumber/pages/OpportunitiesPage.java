package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;

public class OpportunitiesPage extends BasePage{
	public OpportunitiesPage(WebDriver driver) {
	super(driver);
	addObject("opportunities",By.xpath("//a[contains(text(),'Opportunities')]"));
	addObject("opportunityDropDown",By.id("fcf"));
	addObject("opportunityDropdownList",By.xpath("//select[@id='fcf']/option"));
	addObject("New",By.name("new"));
	addObject("oppName",By.id("opp3"));
	addObject("accName",By.id("opp4"));
	addObject("closeDate",By.id("opp9"));
	addObject("stage",By.id("opp11"));
	addObject("probability",By.id("opp12"));
	addObject("leadSource",By.id("opp6"));
	addObject("campSource",By.id("opp17"));
	addObject("save",By.name("save"));
	addObject("newOppPage",By.xpath("//td[@id='bodyCell']"));
	addObject("opportunityPipeline",By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
	addObject("oppPipelineReport",By.id("noTableContainer"));
	addObject("stuckOpportunity",By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
	addObject("stuckOpportunityReport",By.xpath("//h1[contains(text(),'Stuck Opportunities')]"));
	addObject("interval",By.id("quarter_q"));
	addObject("include",By.id("open"));
	addObject("runReport",By.xpath("//input[@value='Run Report']"));
	addObject("oppReport",By.xpath("//h1[contains(text(),'Opportunity Report')]"));
	
	}
}
