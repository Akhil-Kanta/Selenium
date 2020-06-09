package com.hrms.LIB;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Log;


public class general extends Global {
	public void openapplication(){
		Log.info("*******started execution***********");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sis\\Desktop\\New folder (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
           Log.info("application opened");
		System.out.println(driver.getTitle());
		}
		public void closebrowser(){
		driver.quit();
		}
		public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		}
		public void logout(){
			driver.findElement(By.xpath("//div[@id='branding']/a[2]")).click();
			driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[2]/a")).click();
			System.out.println("logout completed");
		}
		public void addemp(){
		System.out.println("adding new emp"); 
		}
		public void delmp(){
		System.out.println("delete emp");
		}
		public void closeapplication(){
			driver.quit();
			Log.info("Application close successfully");
			Log.info("*******End execution***********");
		}
}
