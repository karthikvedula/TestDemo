package com.Testparameter.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class learnParameter {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailid","password"})
	public void gmailLogin(String url,String emailid, String password) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\Downloads\\Documents\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(url);
	System.out.println("testpass");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(emailid);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']//div[@class='VfPpkd-RLmnJb']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.quit();
	}

}