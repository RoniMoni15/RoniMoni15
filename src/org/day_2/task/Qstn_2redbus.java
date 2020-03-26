
package org.day_2.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qstn_2redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("maduravoyal");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("ooty");
	}
}
