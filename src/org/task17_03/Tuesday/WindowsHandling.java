package org.task17_03.Tuesday;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String fid = driver.getWindowHandle();
		driver.get("https://www.google.com/");
		
		Robot r = new Robot();
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));	
	
		Actions ac = new Actions(driver);
		ac.contextClick(images).build().perform();
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions ac1 = new Actions(driver);
		ac1.contextClick(gmail).build().perform();
		Thread.sleep(5000);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		Set<String> pid = driver.getWindowHandles();
		for (String x : pid) {
		
				driver.switchTo().window(x);
				String title = driver.getTitle();
				if(title.contains("Gmail")) {
					driver.findElement(By.xpath("(//a[@class='h-c-header__nav-li-link '])[4]")).click();
					}
					else if(title.contains("Google Image")) {
					driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
				Thread.sleep(5000);
			}
		}
	}
}
		
		
		/*driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Thread.sleep(5000);
		
		Set<String> pid = driver.getWindowHandles();
			driver.findElement(By.id("buy-now-button")).click();
	
			Thread.sleep(5000);*/
			
		

	