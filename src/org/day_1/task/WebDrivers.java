package org.day_1.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDrivers {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\java programs\\Selenium\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.greenstechnology.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.get("https://www.greenstecgnology.com/selenium-course-content.html");
	}

}
