package com.facebook.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import base_Class.Utility_Files;

public class Facebook extends Utility_Files{
	public static WebDriver driver= setproperty();
	public static Page_Manager pom = new Page_Manager(driver);
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		
		
		url("https://www.facebook.com/login/");
		window_commands("maximize");
		String username = File_manager.getInstancetd().getUsername();
		send_keys(pom.getLi().getEmail(),username);
		String password = File_manager.getInstancetd().getpassword();
		send_keys(pom.getLi().getPassword(),password);
		click(pom.getLi().getLoginbtn());
		Thread.sleep(4000);
		//String search = File_manager.getInstancetd().getSearch();
		//send_keys(pom.getHp().getSearch(),search);
		//Thread.sleep(5000);
		//click(pom.getHp().getAddfrnd());
	}	

}
