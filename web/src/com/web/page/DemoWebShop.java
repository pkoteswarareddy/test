package com.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop
{
	private static boolean Revalue;

	public static void main(String[] args) throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.id("pollanswers-1")).isDisplayed();
		if (Revalue)
		{
			System.out.println("poll is selected");
		}
		else
		{
			System.out.println("poll is not selected");
		}
		driver.findElement(By.id("pollanswers-1")).click();
		System.out.println("poll is just now selected");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
