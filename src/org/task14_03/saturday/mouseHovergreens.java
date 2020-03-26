package org.task14_03.saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mouseHovergreens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement crs = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(crs).build().perform();
		
		WebElement crs2 = driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		Actions ac2 =new Actions(driver);
		ac2.moveToElement(crs2).build().perform();
		
		WebElement clk = driver.findElement(By.xpath("//span[text()='Selenium Training']"));
		Actions ac3 =new Actions(driver);
		ac3.click(clk).build().perform();
	}

}
