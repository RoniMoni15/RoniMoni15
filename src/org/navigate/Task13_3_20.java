package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task13_3_20 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement txtprint = driver.findElement(By.xpath("//div[text()='Make Money with Us']"));
		String text = txtprint.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		WebElement txtprnt = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		String text1 = txtprnt.getText();
		System.out.println(text1);*/
		
		
		WebElement d = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
		Actions ac= new Actions(driver);
		ac.contextClick(d).build().perform();
		
	}
	
}
