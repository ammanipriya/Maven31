package com.facebook.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page_Manager {
public WebDriver driver;
public Page_Manager(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

private Log_in li;
public Log_in getLi() {
	if(li==null)
		li=new Log_in(driver);
	return li;
}
public Home_page getHp() {
	if(hp==null)
		hp=new Home_page(driver);
	return hp;
}

private Home_page hp;
}
