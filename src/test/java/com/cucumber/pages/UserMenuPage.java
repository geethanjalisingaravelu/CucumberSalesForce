package com.cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.base.BasePage;

public class UserMenuPage extends BasePage {

	public UserMenuPage(WebDriver driver) {
		super(driver);
		
		
		addObject("userMenuDropDown",By.id("userNav"));
		addObject("userMenuDropDownList",By.xpath("//div[@id='userNav-menuItems']/a"));
		addObject("devConsole",By.xpath("//a[contains(text(),'Developer Console')]"));
		addObject("logout",By.xpath("//a[contains(text(),'Logout')]"));
		addObject("mySettings",By.xpath("//a[@title='My Settings']"));
		addObject("personal",By.id("PersonalInfo_font"));
		addObject("loginHistory",By.id("LoginHistory_font"));
		addObject("downloadLoginHis",By.xpath("//a[contains(text(),'Download login history for last')]"));
		addObject("displayAndLayout",By.id("DisplayAndLayout_font"));
		addObject("custMyTabs",By.id("CustomizeTabs_font"));
		addObject("custAppDropDown",By.id("p4"));
		addObject("availTabs",By.id("duel_select_0"));
		addObject("rightArrow",By.xpath("//img[@title='Add']"));
		addObject("arrowSave",By.name("save"));
		addObject("emailLink",By.id("EmailSetup_font"));
		addObject("emailSettings",By.id("EmailSettings_font"));
		addObject("emailName",By.id("sender_name"));
		addObject("emailAddress",By.id("sender_email"));
		addObject("autBCCRadio",By.id("auto_bcc1"));
		addObject("save1",By.name("save"));
		addObject("calAndRem",By.id("CalendarAndReminders_font"));
		addObject("actRem",By.id("Reminders_font"));
		addObject("openTestRem",By.id("testbtn"));
		addObject("editProfile",By.xpath("//img[@title='Edit Profile']"));
		addObject("iframe",By.id("contactInfoContentId"));
		addObject("about",By.xpath("//a[contains(text(),'About')]"));
		addObject("lastName",By.id("lastName"));
		addObject("saveAll",By.xpath("//input[@value='Save All']"));
		addObject("post",By.xpath("//span[contains(text(),'Post')]"));
		addObject("iframe1",By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addObject("update",By.xpath("//body[contains(text(),'Share an update')]"));
		addObject("share",By.id("publishersharebutton"));
		addObject("file",By.xpath("//span[text()='File']"));
		addObject("uploadFile",By.id("chatterUploadFileAction"));
		addObject("chooseFile",By.id("chatterFile"));
		addObject("profilePhoto",By.id("displayBadge"));
		addObject("addPhoto",By.id("uploadLink"));
		addObject("iframe2",By.id("uploadPhotoContentId"));
		addObject("chooseFile1",By.id("j_id0:uploadFileForm:uploadInputFile"));
		addObject("save",By.id("j_id0:uploadFileForm:uploadBtn"));
		addObject("cropPhoto",By.id("j_id0:j_id7:save"));
		addObject("myProfile",By.xpath("//a[text()='My Profile']"));
		
	
		
	}
}