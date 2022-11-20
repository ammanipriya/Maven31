package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[@class='login']")
private WebElement click_signin;
@FindBy(xpath="//input[@id='email']")
private WebElement email;
@FindBy(xpath="//input[@type='password']")
private WebElement password;
@FindBy(xpath="")
private WebElement signinbtn;

public WebElement getClick_signin() {
	return click_signin;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSigninbtn() {
	return signinbtn;
}


}
