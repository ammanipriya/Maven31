package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eveningdress {
	public WebDriver driver;

	public Eveningdress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[1]")
	private WebElement eveningdress;
	@FindBy(xpath = "((//a[@title='Printed Dress'])[1]")
	private WebElement printeddress;
	@FindBy(xpath = "//a[@title='View']")
	private WebElement view;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement addcount;
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement signinbtn;

	public WebElement getWomen() {
		return women;
	}
	public WebElement getEveningdress() {
		return eveningdress;
	}
	public WebElement getPrinteddress() {
		return printeddress;
	}
	public WebElement getView() {
		return view;
	}
	public WebElement getAddcount() {
		return addcount;
	}
	public WebElement getSigninbtn() {
		return signinbtn;
	}

	
}
