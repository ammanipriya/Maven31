package com.testng.annota;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.adactin_pom.org.File_Readermanager;
import com.adactin_pom.org.Page_Manager;

import base_Class.Utility_Files;

public class Adactin_testNg extends Utility_Files {
	public static WebDriver driver = setproperty();
	public static Page_Manager pom = new Page_Manager(driver);

	@BeforeTest
	private void launch() {
		url("https://adactinhotelapp.com/index.php");
		window_commands("maximize");
	}

	@Test(priority = -2, invocationCount = 2)
	private void refreshh() {
		refresh();
	}

	@Test
	private void username() throws IOException {
		String username = File_Readermanager.getInstanceFR().getInstanceTD().getUsername();
		send_keys(pom.getLp().getUsername(), username);

	}

	@Test(dependsOnMethods = "username")
	private void password() throws IOException {
		String password = File_Readermanager.getInstanceFR().getInstanceTD().getpassword();
		send_keys(pom.getLp().getPassword(), password);
		click(pom.getLp().getLogin());

	}

	
}
