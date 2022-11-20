package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Manager {
	public WebDriver driver;

	 public Page_Manager(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	 public WebDriver getDriver() {
		return driver;
	}
	public Check_out getCo() {
		return co;
	}
	public Eveningdress getEd() {
		return ed;
	}
	public Login_Page getLp() {
		return lp;
	}
	public Printed_Dress getPd() {
		return pd;
	}
	public Proceed_to_checkout getPc() {
		return pc;
	}
	public Summer_dress getSd() {
		return sd;
	}
	public Women getWo() {
		return wo;
	}
	private Check_out co;
	 private Eveningdress ed;
	 private Login_Page lp;
	 private Printed_Dress pd;
	 private Proceed_to_checkout pc;
	 private Summer_dress sd;
	 private Women wo;
	 
	 

}
