package com.pack2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableContents {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEJU\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Testing/Selenium/HTML%20Files/checkboxDemo.html");
		
		List <WebElement> lstContents = driver.findElements(By.xpath("//table"));
		
		for(WebElement ele : lstContents )
		{
			String tableContents = ele.getAttribute("td");
			System.out.println(tableContents);
		}

	}

}
