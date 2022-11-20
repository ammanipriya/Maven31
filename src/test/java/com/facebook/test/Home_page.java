package com.facebook.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver driver;
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//input[@role='combobox']")
private WebElement search;

public WebElement getSearch() {
	return search;
}
public WebElement getAddfrnd() {
	return addfrnd;
}
@FindBy (xpath="(//span[text()='Add Friend'])[1]")
private WebElement addfrnd;
	
	
	
	
	
	
	
	
	
}
