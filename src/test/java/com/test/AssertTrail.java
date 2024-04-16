package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrail {
	@Test
	private void test1() {
		System.out.println("1");
		Assert.assertEquals(true,true);
		
		System.out.println("2");
		Assert.assertTrue(true);
		
		System.out.println("3");
		Assert.assertTrue(false);
		
		System.out.println("4");
		Assert.assertTrue(false);
	}
	
	@Test
	private void test2() {
		System.out.println("Test2");
}	
}
