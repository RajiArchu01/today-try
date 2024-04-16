package org.optional1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.UtilityClass;

public class Optionalannotation extends UtilityClass {
	@Test
	@Parameters({"username","password"})
	
	private void test1(@Optional("Archuma01@")String email,@Optional("Archuma01")String pass)  {
		System.out.println(email);
		System.out.println(pass);


		}

}
