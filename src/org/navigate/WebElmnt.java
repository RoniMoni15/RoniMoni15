package org.navigate;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElmnt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//To find the text:
		WebElement btn = driver.findElement(By.xpath("//span[text()='Create an account']"));
		String text = btn.getText();
		System.out.println(text);
		
		//To get Attributes:
		WebElement regEmail = driver.findElement(By.name("reg_email__"));
		String attribute = regEmail.getAttribute("aria-label");
		System.out.println(attribute);
		
		//To verify disable & enable:
	WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		boolean displayed = userName.isDisplayed();
		boolean enabled = userName.isEnabled();
		System.out.println(displayed);
		System.out.println(enabled);
		if(displayed&&enabled) {
			userName.clear();
			userName.sendKeys("moni@gmail.com");
	
	
	/*WebElement a = driver.findElement(By.xpath("//input[@name='email']"));
	WebElement b = driver.findElement(By.xpath("//input[@name='pass']"));
	WebElement c = driver.findElement(By.xpath("//input[@name='firstname']"));
	isDisplayed(a);
	isDisplayed(b);
	isDisplayed(c);
	isEnabled(a);
	isEnabled(b);
	isEnabled(c);*/
	}
		//To verify select:
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='2']"));
		radioBtn.click();
		boolean selected = radioBtn.isSelected();
		System.out.println(selected);
	}
		
	/*public static boolean isDisplayed(WebElement wb) {
		boolean displayed=wb.isDisplayed();
		System.out.println(displayed);
		return displayed;
	}
		public static boolean isEnabled(WebElement eb) {
			boolean enabled=eb.isEnabled();
			System.out.println(enabled);
			return enabled;*/
			
	
	
}
