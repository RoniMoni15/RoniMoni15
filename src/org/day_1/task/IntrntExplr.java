  package org.day_1.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IntrntExplr {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", 
			"D:\\java programs\\Selenium\\Drivers\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	
	driver.get("https://www.google.com/");


}
}
