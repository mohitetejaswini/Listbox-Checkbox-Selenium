package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleOrMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/SingleNMultiSelectListbox.html");
		
		WebElement multiplabox = driver.findElement(By.name("State"));
		
		Select multiSelect = new Select(multiplabox);
		
		boolean status = multiSelect.isMultiple();
		System.out.println(status);
		
		WebElement sElement = driver.findElement(By.name("Country"));
		
		Select singleSel = new Select(sElement);
		
		boolean status2 = singleSel.isMultiple();
		System.out.println(status2);
		
		//driver.close();
		
		
	}

}
