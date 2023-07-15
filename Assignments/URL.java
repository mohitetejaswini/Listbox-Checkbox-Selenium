package com.pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("file:///E:/Testing/Selenium/HTML%20Files/checkboxDemo.html");
			Thread.sleep(2000);
			
			List < WebElement> lstChk = driver.findElements(By.xpath("//a"));
			
			int count = lstChk.size();
			
			for(WebElement ele : lstChk) {
				
				String urls = ele.getAttribute("href");
				System.out.println(urls);
				
			}
			
			
		
	}

}
