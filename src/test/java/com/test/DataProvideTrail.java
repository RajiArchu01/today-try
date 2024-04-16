package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideTrail {
	
	@DataProvider(name="testdata")
	private Object[][] tc1(){
		Object a[][]= {{"archum01@","985623896546"},
		               {"rajibnec01@","55466446526"},
		               {"rajiarchu01@","68942464345"},
		               {"rajarchu52@","98524713555"}};
		return a;
	}
	@Test(dataProvider="testdata")
	private void test1(String username,String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	}
