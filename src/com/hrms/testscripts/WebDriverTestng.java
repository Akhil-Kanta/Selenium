package com.hrms.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverTestng {
 private WebDriver driver;
 @BeforeClass
 public void startup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sis\\Desktop\\New folder (2)\\chromedriver.exe");
     driver=new ChromeDriver();
 }
 @Test (description="OrangeHRM Login")
 public void Login() throws Exception{
 Reporter.log("Test case steps");
 driver.get("https://opensource-demo.orangehrmlive.com");
 Reporter.log("1.Application opened");
 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
 Reporter.log("2.typing user name");
 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
 Reporter.log("3.Typing password");
 driver.findElement(By.name("Submit")).click();
 Thread.sleep(3000);
 Reporter.log("4.login completed");
 driver.findElement(By.xpath("//div[@id='branding']/a[2]")).click();
	driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[2]/a")).click();
	Reporter.log("5.logout completed");
 }
 @AfterClass
 public void teardown(){
 driver.quit();
 }
}
