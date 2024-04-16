package com.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTrail {
	@Test
	private void test1() {
		SoftAssert s = new SoftAssert();
		
		System.out.println("1");
		s.assertTrue(true);
		
		System.out.println("2");
		s.assertTrue(true);

		System.out.println("3");
		s.assertTrue(false);
		
		System.out.println("4");
		s.assertAll();
	}
	
	@Test
	private void test2() {
		System.out.println("Test2");
}	
}
