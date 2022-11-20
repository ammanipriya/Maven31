package com.automation_pom.org;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import base_Class.Utility_Files;

public class Runner_Class extends Utility_Files {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		setproperty();
		url("http://automationpractice.com/index.php");
		window_commands("maximize");
		Page_Manager pom = new Page_Manager(driver);
		click(pom.getLp().getEmail());
		send_keys(pom.getLp().getEmail(), "vipriya@gmail.com");
		send_keys(pom.getLp().getPassword(), "priya");
		moveto(pom.getWo().getWomenbtn());
		moveto(pom.getWo().getTshirt());
		click(pom.getWo().getTshirt());
		Thread.sleep(3000);
		click(pom.getWo().getCheckbox());

		moveto(pom.getWo().getAvailablenow());
		moveto(pom.getPd().getPrinted());
		click(pom.getPd().getPrinted());
		Thread.sleep(5000);
		moveto(pom.getPd().getAdditem());
		click(pom.getPd().getAdditem());
		select_index(pom.getPd().getSize(), 1);
		click(pom.getPd().getAddtocart());
		driver.navigate().back();
		moveto(pom.getEd().getWomen());
		moveto(pom.getEd().getEveningdress());
		click(pom.getEd().getPrinteddress());
		Thread.sleep(6000);

		moveto(pom.getEd().getView());
		Thread.sleep(5000);

		moveto(pom.getEd().getView());
		click(pom.getEd().getView());
		moveto(pom.getEd().getAddcount());
		click(pom.getEd().getAddcount());
		select_index(pom.getEd().getAddcount(), 1);
		click(pom.getEd().getSigninbtn());
		driver.navigate().back();
		moveto(pom.getSd().getWomen());
		moveto(pom.getSd().getSummerdress());
		click(pom.getSd().getSummerdress());
		Thread.sleep(6000);
		moveto(pom.getSd().getPrinted());
		Thread.sleep(5000);

		moveto(pom.getSd().getView());
		click(pom.getSd().getView());
		moveto(pom.getSd().getOnemore());
		click(pom.getSd().getOnemore());
		select_index(pom.getSd().getSelect(), 1);
		click(pom.getSd().getSubmitbtn());
		Thread.sleep(6000);
		click(pom.getPc().getChkout());
		click(pom.getPc().getCheckout());
		send_keys(pom.getCo().getEmail(), "vipriya@gmail.com");
		send_keys(pom.getCo().getPassword(), "priya");
		click(pom.getCo().getSubmitbtn());
		click(pom.getCo().getSubmit());
		click(pom.getCo().getCheckbox());
		click(pom.getCo().getSubmit1());
		click(pom.getCo().getPayment());
		click(pom.getCo().getFinalsubmit());
		down();
		down();
		down();
		Takes_Screenshot("C:\\Users\\Priya\\eclipse-workspace\\Framework\\Screenshots\\Mystoreproject.png");
		// TakesScreenshot ts= (TakesScreenshot) d;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des =new
		// File("C:\\Users\\Priya\\eclipse-workspace\\Framework\\Screenshots\\Mystoreproject.png");
		// FileUtils.copyFile(src, des);

	}

}
