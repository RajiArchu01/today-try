package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParellelMethod {
	@Test
	private void test1() { 
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("http://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("rajibe01@");
	driver.findElement(By.id("password")).sendKeys("900358756");
	driver.findElement(By.id("login")).click();	
	}
	@Test
	private void test2() {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("rajibe01@");
		driver.findElement(By.id("password")).sendKeys("900358756");
		driver.findElement(By.name("commit")).click();	
	}
	@Test
    private void test3() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://zoom.us/signin#/login");
		driver.findElement(By.id("email")).sendKeys("rajibe01@");
		driver.findElement(By.id("password")).sendKeys("900358756");
		driver.findElement(By.xpath("//span[text()=' Sign In ']")).click();	
			}
	@Test
	private void test4() {
		System.out.println("Test4");
	}
	@Test
	private void test5() {
		System.out.println("Test5");
	}
	@Test
    private void test6() {
		System.out.println("Test6");
	}


}
