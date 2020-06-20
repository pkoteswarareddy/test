package com.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2
{
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		boolean revalue=driver.findElement(By.id("vote-poll-1")).isDisplayed();
		if (revalue)
		{
		System.out.println("vote element is displayed");
		driver.findElement(By.id("vote-poll-1")).click();
		}
	}

}
