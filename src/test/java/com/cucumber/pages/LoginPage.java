package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;

public class LoginPage extends BasePage{
	
	
	
	public LoginPage(WebDriver driver) {
	super(driver);
	addObject("username",By.id("username"));
	addObject("password",By.id("password"));
	addObject("Login",By.id("Login"));
	addObject("Verify",By.id("save"));
	addObject("errorMessage",By.id("error"));
	addObject("forgotPassword",By.id("forgot_password_link"));
	addObject("forgotPasswordUn",By.id("un"));
	addObject("forgotPasswordCont",By.id("continue"));
	addObject("forgotPwdMsg",By.xpath("//p[contains(text(),'sent you an email')]"));
	addObject("rememberMe",By.id("rememberUn"));
	addObject("userMenuDropDown",By.id("userNav"));
	addObject("logout",By.xpath("//a[text()='Logout']"));
	addObject("actualOutput",By.id("idcard-identity"));
	}
}
