package com.pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountSelectDeselect70 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/SingleNMultiSelectListbox.html");
		
		WebElement multiplbox = driver.findElement(By.name("Country"));
		Select multipleSel = new Select(multiplbox);
		List <WebElement> allOptions = multipleSel.getOptions();
		
		int count = allOptions.size();
		System.out.println(count);
		for(int i=0; i<count; i++) {
			Thread.sleep(2000);
			multipleSel.selectByIndex(i);
			
		}
		
		multipleSel.deselectAll();
		

	}

}
