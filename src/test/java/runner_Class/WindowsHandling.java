package runner_Class;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Class.Utility_Files;

public class WindowsHandling extends Utility_Files {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Priya\\eclipse-workspace\\Maven31\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement best = driver.findElement(By.xpath("//div[@id='nav-xshop']//descendant::a[.='Best Sellers']"));
		right_Click(driver, best);
		down();
		enter();
		WebElement mobiles = driver.findElement(By.xpath("//div[@id='nav-xshop']//descendant::a[.='Mobiles']"));
		right_Click(driver, mobiles);
		down();
		enter();
		WebElement customer = driver
				.findElement(By.xpath("//div[@id='nav-xshop']//descendant::a[.='Customer Service']"));
		right_Click(driver, customer);
		down();
		enter();
		
		Set<String> windowHandles = driver.getWindowHandles();
String url ="https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";
for (String all_ID : windowHandles) {
	

if (driver.switchTo().window(all_ID).getCurrentUrl().equals(url)) {
	System.out.println(url);
	break;
	
}

}
	}

}
