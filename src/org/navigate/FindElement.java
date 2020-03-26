package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("greens@gmail.com");
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("annet");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("joul");
		
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("7299379388");
		
		WebElement passWord = driver.findElement(By.id("u_0_w"));
		passWord.sendKeys("ronimoni15");
		
		WebElement dob = driver.findElement(By.name("birthday_day"));
		dob.sendKeys("14");
		
		WebElement month = driver.findElement(By.id("month"));
		month.sendKeys("08");
		
		WebElement year = driver.findElement(By.id("year"));
		year.sendKeys("1992");
		
		WebElement gender = driver.findElement(By.name("sex"));
		gender.click();
		
		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();
		
	}

}
