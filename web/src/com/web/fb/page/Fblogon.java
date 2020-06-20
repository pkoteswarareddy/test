package com.web.fb.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogon {

	private static String Admin;
	private static String admin123;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.id(""));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String Title=driver.getTitle();
		if (Title.equals("orangehrm"))
		{
			System.out.println(Title +"is displayed");
		}
		WebElement objun=driver.findElement(By.id("txtUsername"));
		WebElement objpwd=driver.findElement(By.id("txtPassword"));
		WebElement objlogin=driver.findElement(By.id("btnLogin"));
		
		if (objun.isDisplayed()&objpwd.isDisplayed()&objlogin.isDisplayed())
        {
		 System.out.println("username,password,login is available");	
		}
        String un= "Admin";
        String pwd= "admin123";
        
        objun.clear();
        objun.sendKeys(un);
        
        objpwd.clear();
        objpwd.sendKeys(pwd);
        
        objlogin.clear();
		
		

	}

}
