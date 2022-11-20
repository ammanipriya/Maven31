package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_to_checkout {
	public WebDriver driver;
	public Proceed_to_checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy (xpath="//a[@title='Proceed to checkout']")
private WebElement chkout;

@FindBy (xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement checkout;

public WebElement getChkout() {
	return chkout;
}
public WebElement getCheckout() {
	return checkout;
}
}
