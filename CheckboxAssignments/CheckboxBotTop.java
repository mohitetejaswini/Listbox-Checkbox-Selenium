package com.pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxBotTop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/checkboxDemo.html");
		List <WebElement> lstchk = driver.findElements(By.cssSelector("input[type= 'checkbox']"));
		
		int count = lstchk.size();
		
		System.out.println(count);
	
		for(int i=count-1; i>=0; i--)
		{
			Thread.sleep(1000);
			lstchk.get(i).click();
			
		}
		

	}


	}


