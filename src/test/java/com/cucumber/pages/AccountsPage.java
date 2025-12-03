package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;

public class AccountsPage extends BasePage{
	public AccountsPage(WebDriver driver) {
	super(driver);
	
	addObject("accounts",By.xpath("//a[contains(text(),'Accounts')]"));
	addObject("New",By.xpath("//input[@name='new']"));
	addObject("accName",By.id("acc2"));
	addObject("type",By.id("acc6"));
	addObject("custPriority",By.id("00NgK00002Keeew"));
	addObject("save",By.name("save"));
	addObject("newAccountPage",By.xpath("//h2[contains(text(),'Aut Acc10')]"));
	addObject("viewDropDown",By.name("fcf"));
	addObject("createNewView",By.xpath("//a[contains(text(),'Create New View')]"));
	addObject("viewName",By.id("fname"));
	addObject("viewUniqueName",By.id("devname"));
	addObject("edit",By.xpath("//a[contains(text(),'Edit')]"));
	addObject("filterFields",By.id("fcol1"));
	addObject("operatorFields",By.id("fop1"));
	addObject("value",By.id("fval1"));
	addObject("fieldToDisplayDropDown",By.id("colselector_select_0"));
	addObject("rightArrow",By.xpath("//img[@class='rightArrowIcon']"));
	addObject("recentlyViewed",By.xpath("//table/tbody/tr[2]/th"));
	addObject("mergeAccLink",By.xpath("//a[contains(text(),'Merge Accounts')]"));
	addObject("mergeAcc",By.id("srch"));
	addObject("findAccBtn",By.name("srchbutton"));
	addObject("listAcc1",By.id("cid0"));
	addObject("listAcc2",By.id("cid1"));
	addObject("next",By.name("goNext"));
	addObject("merge",By.xpath("//input[@value=' Merge ']"));
	addObject("lastActivity",By.partialLinkText("Accounts with last activity > 30 days"));
	addObject("dateFieldDropDown",By.id("ext-gen149"));
	addObject("next",By.id("ext-gen149"));
	addObject("createdDate",By.xpath("//div[contains(text(),'Created Date')]"));
	addObject("from",By.id("ext-gen153"));
	addObject("today1",By.xpath("(//button[contains(text(),'Today')])[1]"));
	addObject("to",By.id("ext-comp-1045"));
	addObject("toCalendar",By.id("ext-gen155"));
	addObject("today2",By.xpath("(//button[contains(text(),'Today')])[2]"));
	addObject("save1",By.id("ext-gen50"));
	addObject("reportNameInput",By.id("saveReportDlg_reportNameField"));
	addObject("uniqueNameInput",By.id("saveReportDlg_DeveloperName"));
	addObject("saveAndRunReport",By.xpath("//button[contains(text(),'Save and Run Report')]"));
	addObject("reportName",By.xpath("//h1[text()='SalesForceRep']"));

	

	}
	}

