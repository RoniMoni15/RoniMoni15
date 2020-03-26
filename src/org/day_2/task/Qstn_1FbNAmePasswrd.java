package org.day_2.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qstn_1FbNAmePasswrd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement emailName = driver.findElement(By.name("email"));
		emailName.sendKeys("monironi@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement passwrd = driver.findElement(By.name("pass"));
		passwrd.sendKeys("1234567890");
	}
}
