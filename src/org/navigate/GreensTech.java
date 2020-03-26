package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement ro =driver.findElement(By.xpath("//p[text()='Placements Company Details']"));
	
	  JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",ro);
		WebElement printxt = driver.findElement(By.xpath("//b[text()='Selenium WEB-DRIVER']"));
		String text = printxt.getText();
		System.out.println(text);
		
		js.executeScript("arguments[0].scrollIntoView(false)",ro);
		
		
}
}
