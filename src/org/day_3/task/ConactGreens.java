package org.day_3.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConactGreens {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", 
			"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://greenstech.in/selenium-course-content.html");
	Thread.sleep(2000);
	
	WebElement clkcontact = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	clkcontact.click();
	
	//driver.findElement(By.id(""))

}
}