package com.yourstore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.yourstore.base.BaseClass;

public class registerpage extends BaseClass {
	@FindBy(xpath="//input[@id='input-firstname']")
WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement Lastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement phonenumber;

}
