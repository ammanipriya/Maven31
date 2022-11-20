package com.facebook.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_in {
	public WebDriver driver;
	public Log_in(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy (xpath="//input[@id='email']")
private WebElement email;
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginbtn() {
	return loginbtn;
}

@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
@FindBy (xpath="//button[@id='loginbutton']")
private WebElement loginbtn;
}
