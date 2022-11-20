package com.automation_pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
		public WebDriver driver;
		public Women(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//a[@title='Women']")
		private WebElement womenbtn;
		@FindBy(xpath="(//a[@title='Casual Dresses'])[1]")
		private WebElement tshirt;
		@FindBy(xpath="(//input[@type='checkbox'])[1]")
		private WebElement checkbox;
		@FindBy(xpath="//span[@class='available-now']")
		private WebElement availablenow;

		public WebElement getWomenbtn() {
			return womenbtn;
		}
		public WebElement getTshirt() {
			return tshirt;
		}
		public WebElement getCheckbox() {
			return checkbox;
		}
		public WebElement getAvailablenow() {
			return availablenow;
		}

				
}
