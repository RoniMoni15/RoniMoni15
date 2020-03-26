package org.navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotelApp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\java programs\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactin.com/HotelApp/SearchHotel.php");
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("MonishaS");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("joulmonisha");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		Thread.sleep(2000);
		
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	location.sendKeys("London");
	
	Thread.sleep(2000);
	
	WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
	hotel.sendKeys("Hotel Sunshine");
	Thread.sleep(2000);
	
	WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	room.sendKeys("Deluxe");
	Thread.sleep(2000);
	
	WebElement rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
	rooms.sendKeys("1-One");
	Thread.sleep(2000);
	
	WebElement date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	date.sendKeys("11/03/2020");
	Thread.sleep(2000);
	
	WebElement date1 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	date1.sendKeys("13/03/2020");
	Thread.sleep(2000);
	
	WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
	adult.sendKeys("2-Two");
	Thread.sleep(2000);
	
	WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
	child.sendKeys("1-One");
	Thread.sleep(2000);
	
	WebElement search = driver.findElement(By.name("Submit"));
	search.click();

	WebElement radioBtn = driver.findElement(By.xpath("//input[@value='0']"));
	radioBtn.click();
	
	WebElement continuBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
	continuBtn.click();
	
	WebElement frstName = driver.findElement(By.xpath("//input[@name='first_name']"));
	frstName.sendKeys("Annet");
	
	WebElement lstName = driver.findElement(By.xpath("//input[@name='last_name']"));
	lstName.sendKeys("Joul");
	
	WebElement addrs = driver.findElement(By.xpath("//textarea[@name='address']"));
	addrs.sendKeys("No:105, AmmanStreet, Maduravoyal, Ch-95");
	
	
	}

}
