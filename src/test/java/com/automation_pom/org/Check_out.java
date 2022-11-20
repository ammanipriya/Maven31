package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_out {
	public WebDriver driver;
	public Check_out(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//input[@id='email']")
	private WebElement email ;
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	@FindBy (xpath="(//button[@type='submit'])[3]")
	private WebElement submitbtn;
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement submit ;
	@FindBy (xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement submit1;
	
	@FindBy (xpath="(//p[@class='payment_module'])[1]")
	private WebElement payment;
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement finalsubmit;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getSubmit1() {
		return submit1;
	}
	public WebElement getPayment() {
		return payment;
	}
	public WebElement getFinalsubmit() {
		return finalsubmit;
	}


	
	
	
}
