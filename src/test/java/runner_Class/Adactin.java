package runner_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import base_Class.Utility_Files;
public class Adactin extends Utility_Files {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Priya\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		url("https://adactinhotelapp.com/index.php");
		window_commands("maximize");
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		send_keys(user, "Ammanipriya");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		send_keys(password, "adactin");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		click(login);
		WebElement s1 = driver.findElement(By.xpath("//select[@name='location']"));
		select_index(s1, 2);
		WebElement s2 = driver.findElement(By.xpath("//select[@name='hotels']"));
		select_text(s2, "Hotel Creek");
		WebElement s3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		select_value(s3, "Standard");
		WebElement s4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		select_index(s4, 2);
		WebElement s5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		select_index(s5, 1);
		WebElement s6 = driver.findElement(By.xpath("//select[@name='child_room']"));
		select_index(s6, 1);
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		click(submit);
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		click(radio);
		WebElement name = driver.findElement(By.xpath("//input[@name='continue']"));
		click(name);
		WebElement name1 = driver.findElement(By.xpath("//input[@name='first_name']"));
		send_keys(name1, "Sangeetha");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		send_keys(lastname, "Rajesh");
		WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
		send_keys(add, "plot no.3 guindy chennai");
		WebElement lane = driver.findElement(By.xpath("//input[@name='cc_num']"));
		send_keys(lane, "1234567891234567");
		WebElement s7 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		select_value(s7, "VISA");
		WebElement s8 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		select_index(s8, 3);
		WebElement s9 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		select_value(s9, "2022");
		 WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		 send_keys(cvv, "545");
		 WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		 click(booknow);
		 WebElement submit1 = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		 click(submit1);
	}

}
