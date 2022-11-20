package runner_Class;

import java.awt.AWTException;

import java.io.IOException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base_Class.Utility_Files;

public class Mystore extends Utility_Files {
	//public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		setproperty();
		url("http://automationpractice.com/index.php");
		window_commands("maximize");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		click(signin);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		send_keys(email, "vipriya@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		send_keys(pass, "priya");
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		moveto(women);
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		moveto(tshirt);
		click( tshirt);
		Thread.sleep(3000);
		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		click(checkbox);
		driver.findElement(By.xpath("//span[@class='available-now']"));

		WebElement add = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		moveto(add);
		WebElement more = driver.findElement(By.xpath("//a[@title='View']"));
		moveto(more);
		click(more);
		Thread.sleep(5000);
		WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		moveto(quantity);
		click(quantity);
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		select_index(size, 1);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.navigate().back();
		WebElement women1 = driver.findElement(By.xpath("//a[@title='Women']"));
		moveto(women1);
		WebElement eve = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
		moveto(eve);
		click(eve);
		Thread.sleep(6000);

		WebElement img = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		moveto(img);
		Thread.sleep(5000);

		WebElement more1 = driver.findElement(By.xpath("//a[@title='View']"));

		moveto(more1);
		click(more1);
		WebElement quantity1 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		moveto(quantity1);
		click(quantity1);
		WebElement size1 = driver.findElement(By.xpath("//select[@name='group_1']"));
		select_index(size1, 1);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.navigate().back();
		WebElement women2 = driver.findElement(By.xpath("//a[@title='Women']"));
		moveto(women2);
		WebElement summer = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		moveto(summer);
		click(summer);
		Thread.sleep(6000);
		WebElement yellow = driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[2]"));
		moveto(yellow);
		Thread.sleep(5000);

		WebElement more2 = driver.findElement(By.xpath("(//a[@title='View'])[2]"));
		moveto(more2);
		click(more2);
		WebElement quantity2 = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		moveto(quantity2);
		click(quantity2);
		WebElement size2 = driver.findElement(By.xpath("//select[@name='group_1']"));
		select_index(size2, 1);
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		click(submit);
		Thread.sleep(6000);
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click(checkout);
		WebElement proceedto = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click(proceedto);
		WebElement email1 = driver.findElement(By.xpath("//input[@id='email']"));
		send_keys(email1, "vipriya@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		send_keys(password, "priya");
		WebElement address = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		click(address);
		WebElement shipping = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(shipping);
		WebElement chk = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click(chk);
		WebElement submit1 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(submit1);
		WebElement payment = driver.findElement(By.xpath("(//p[@class='payment_module'])[1]"));
		click(payment);
		WebElement checkoutfinal = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(checkoutfinal);
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
