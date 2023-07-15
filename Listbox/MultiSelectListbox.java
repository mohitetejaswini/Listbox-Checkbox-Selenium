package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/MultiSelectListbox.html");
		
		WebElement multiplabox = driver.findElement(By.name("Country"));
		
		Select multipleSel = new Select(multiplabox);
		multipleSel.selectByIndex(5);
		Thread.sleep(2000);
		multipleSel.selectByValue("BZL");
		Thread.sleep(2000);
		multipleSel.selectByVisibleText("United Kingdom");
		
		Thread.sleep(2000);
		
		multipleSel.selectByIndex(2);
		Thread.sleep(2000);
		multipleSel.selectByValue("USD");
		Thread.sleep(2000);
		multipleSel.selectByVisibleText("Australia");
		
		multipleSel.deselectAll();
		
		driver.close();
		

	}

}
