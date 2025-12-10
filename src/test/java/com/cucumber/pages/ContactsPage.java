package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;

public class ContactsPage extends BasePage {

	
	public ContactsPage(WebDriver driver) {
	super(driver);
	
	addObject("contacts",By.xpath("//a[text()='Contacts']"));
	addObject("New",By.xpath("//input[@title='New']"));
	addObject("lname",By.id("name_lastcon2"));
	addObject("accName",By.id("con4"));
	addObject("save",By.name("save"));
	addObject("newContact",By.xpath("//h2[@class='pageDescription']"));
	addObject("createNewView",By.xpath("//a[contains(text(),'Create New View')]"));
	addObject("viewName",By.id("fname"));
	addObject("viewUniqueName",By.id("devname"));
	addObject("viewDropDown",By.name("fcf"));
	addObject("contactsDropDown",By.id("hotlist_mode"));
	addObject("recentContacts",By.xpath("//table[@class='list']"));
	addObject("myContactsView",By.xpath("//div[@class='listBody']"));
	addObject("recentlyCreated",By.xpath("//table[@class='list']/tbody/tr[2]/th[1]/a"));
	addObject("contactInfo",By.xpath("//h2[@class='pageDescription']"));
	addObject("createNewView",By.xpath("//a[contains(text(),'Create New View')]"));
	addObject("viewUniqueName",By.id("devname"));
	addObject("errorMsg",By.xpath("//div[contains(text(), 'You must enter a value')]"));
	addObject("viewName",By.id("fname"));
	addObject("cancel",By.name("cancel"));
	addObject("saveAndNew",By.name("save_new"));
	addObject("contactEdit",By.xpath("//h1[contains(text(),'Contact Edit')]"));
	
	}
}