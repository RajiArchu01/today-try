package com.parameter;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class Parameterization extends UtilityClass {
	
	@Test
	@Parameters({"username","password"})
	
	private void test1(String email, String pass)  {
		browserLaunch("chrome");
		launchurl("https://www.facebook.com/");
		ForLocating lp =new ForLocating();

		WebElement username = lp.getUsername();
		typetext(username,email);

		WebElement password = lp.getPassword();
		typetext(password,pass);

		WebElement login = lp.getLogin();
		btnclick(login);
}
	
}