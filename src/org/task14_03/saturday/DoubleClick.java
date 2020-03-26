package org.task14_03.saturday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(2000);
		WebElement frstName = driver.findElement(By.id("fname"));
		WebElement submitBtn = driver.findElement(By.id("idOfButton"));
		WebElement dblclkBtn = driver.findElement(By.id("dblClkBtn"));
		Actions ac = new Actions(driver);
		ac.sendKeys(frstName,"Monisha").build().perform();
		Thread.sleep(2000);
		ac.click(submitBtn).build().perform();
		Thread.sleep(2000);
		ac.doubleClick(dblclkBtn).build().perform();
	}


}
