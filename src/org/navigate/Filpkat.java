package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkat {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", 
					"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			
			
			/*WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			userName.sendKeys("jose-franco007@yahoo.com");
			
			WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])"));
			pass.sendKeys("manufacturing");
			
			WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			login.click();*/
			
			WebElement login = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
			login.click();
			Thread.sleep(2000);
			
		WebElement ro =driver.findElement(By.xpath("//a[@class='_1DOPe6']"));
			
             JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView(true)",ro);
			
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			
			
			/*WebElement txtprint = driver.findElement(By.xpath("//div[text()='Make Money with Us']"));
			String text = txtprint.getText();
			System.out.println(text);
			
			Thread.sleep(2000);
			
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
			WebElement txtprnt = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
			String text1 = txtprnt.getText();
			System.out.println(text1);
			
			Thread.sleep(2000);
			
	
		
	}
	} 
	
*/
			
		}
		}