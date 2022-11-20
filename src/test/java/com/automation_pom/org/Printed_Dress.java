package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dress {

	public WebDriver driver;

	public Printed_Dress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("(//a[@title='Printed Dress'])[1]"))
	private WebElement printed;
	@FindBy(xpath = "//a[@title='View']")
	private WebElement view;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement additem;
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement addtocart;
	@FindBy(xpath = "//button[@type='submit'])[3]")
	private WebElement submit;

	public WebElement getPrinted() {
		return printed;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getAdditem() {
		return additem;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
