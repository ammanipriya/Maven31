package com.testng.annota;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_Class.Utility_Files;

public class Timeouts {
	 WebDriver driver = Utility_Files.setproperty();
	
	
@Test(expectedExceptions=NoSuchElementException.class)
private void exception() {
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	driver.findElement(By.id("eemail"));
	
}
}

