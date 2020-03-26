package org.task15_03.sunday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_3 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://en.wikipedia.org/wiki/Programming_languages_used_in_most_popular_websites");
		Thread.sleep(2000);
		List<WebElement> tables = driver.findElements(By.tagName("table"));
		WebElement table = tables.get(0);
		WebElement tbody = table.findElement(By.tagName("tbody"));
		
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
		for (WebElement trow : trows) {

	List<WebElement>tdatas=trow.findElements(By.tagName("td"));
	for (int i = 0; i < tdatas.size(); i++) {
		WebElement tdataHeader = tdatas.get(0);
		String text = tdataHeader.getText();
	if(text.equalsIgnoreCase("google.com[2]"));
	WebElement tdata = tdatas.get(i);
	String value = tdata.getText();
	System.out.println(value);
	}
}
}
}