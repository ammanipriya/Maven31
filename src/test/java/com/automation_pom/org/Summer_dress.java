package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer_dress {
	public WebDriver driver;
	public Summer_dress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy (xpath="//a[@title='Women']")
private WebElement women;
@FindBy (xpath="(//a[@title='Summer Dresses'])[1]")
private WebElement summerdress;
@FindBy (xpath="(//img[@title='Printed Summer Dress'])[2]")
private WebElement printed;
@FindBy (xpath="(//a[@title='View'])[2]")
private WebElement view;
@FindBy (xpath="//i[@class='icon-plus']")
private WebElement onemore;
@FindBy (xpath="//select[@name='group_1']")
private WebElement select;
@FindBy (xpath="(//button[@type='submit'])[3]")
private WebElement submitbtn;


public WebElement getWomen() {
	return women;
}
public WebElement getSummerdress() {
	return summerdress;
}
public WebElement getPrinted() {
	return printed;
}
public WebElement getView() {
	return view;
}
public WebElement getOnemore() {
	return onemore;
}
public WebElement getSelect() {
	return select;
}
public WebElement getSubmitbtn() {
	return submitbtn;
}

}
