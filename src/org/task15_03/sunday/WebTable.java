package org.task15_03.sunday;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(2000);
		
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement thead = table.findElement(By.tagName("thead"));
		WebElement tr = thead.findElement(By.tagName("tr"));
		List<WebElement> th = tr.findElements(By.tagName("th"));
		for (WebElement x : th) {
			String text = x.getText();
			System.out.println(text+"\t");
		}
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> trows=tbody.findElements(By.tagName("tr"));
		for (WebElement trow : trows) {
			List<WebElement>tdatas=trow.findElements(By.tagName("td"));
			for (WebElement tdata : tdatas) {
			String text = tdata.getText();
			System.out.println(text+"\t");
			
			}
			System.out.println();
		}
		driver.quit();
	}
}

