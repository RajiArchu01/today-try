package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusBooking {
	

		public static void main(String[] args) {
			
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");	
	    driver.manage().window().maximize();
		}
	}


