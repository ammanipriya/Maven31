package com.testng.annota;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.facebook.test.File_manager;
import com.facebook.test.Page_Manager;

import base_Class.Utility_Files;

public class Priority extends Utility_Files {
	public static WebDriver driver = setproperty();
	public static Page_Manager pom = new Page_Manager(driver);

	@Test(priority = -1)//priority
	private void launch() {

		url("https://www.facebook.com/login/");
	}

	@Test(priority = 0)
	private void window() {
		window_commands("maximize");
	}
//invocationtimeout, ivocationcount
	@Test(priority = 1, invocationCount = 2)
	private void Reefresh() {
		refresh();
	}

	@Test(priority = 1)
	private void username() throws IOException {
		String username = File_manager.getInstancetd().getUsername();
		send_keys(pom.getLi().getEmail(), username);
	}
//depends on method,timeOut,alwaysRun
	
	@Test(priority = 2, dependsOnMethods = "username")
	private void password() throws IOException, InterruptedException {
		String password = File_manager.getInstancetd().getpassword();
		Thread.sleep(2000);
		send_keys(pom.getLi().getPassword(), password);
	}
	

	@Test(priority = 3)
	private void clickbtn() {
		click(pom.getLi().getLoginbtn());
	}
//description //ignore
	@Ignore
	@Test(description = "successfull", priority = 4)
	private void descr() {
		System.out.println("Facebook successfully logged in");
	}

	
	
	
	
	
}
