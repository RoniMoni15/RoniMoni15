package org.task14_03.saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement trgt1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src1, trgt1).build().perform();
		
	}

}
