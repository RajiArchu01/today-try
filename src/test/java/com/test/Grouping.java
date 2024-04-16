package com.test;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"sanity"})
	private void test1() {
		System.out.println("Test1");
	}
	@Test(groups= {"smoke"})
	private void test2() {
		System.out.println("Test2");
	}
	@Test(groups= {"smoke"})
    private void test3() {
		System.out.println("Test3");
	}
	@Test(groups= {"regression"})
	private void test4() {
		System.out.println("Test4");
	}
	@Test(groups= {"regression"})
	private void test5() {
		System.out.println("Test5");
	}
	@Test(groups= {"sanity"})
    private void test6() {
		System.out.println("Test6");
	}
	@Test(groups= {"regression"})
	private void test7() {
		System.out.println("Test5");
	}
	
	
	
	
	
	
}
