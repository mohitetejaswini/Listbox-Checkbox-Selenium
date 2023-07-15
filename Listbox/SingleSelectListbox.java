package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/SingleSelectListbox.html");
		
		WebElement singlebox = driver.findElement(By.name("Country"));
		Select singleSel = new Select(singlebox);
		
		singleSel.selectByIndex(2);
		Thread.sleep(2000);
		singleSel.selectByValue("AUD");
		Thread.sleep(2000);
		singleSel.selectByVisibleText(" United States ");
		
		
	}

}
