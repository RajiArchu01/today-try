package com.test;

import org.testng.annotations.Test;

public class Invocation<invocation> {
	@Test(priority=3)
	private void test1() {
		System.out.println("Test1");
	}
	@Test(priority=2,invocationCount=2)
	private void test2() {
		System.out.println("Test2");
	}
	@Test(priority=4)
	private void test3() {
		System.out.println("Test3");
	}
	@Test(priority=6,invocationCount=5)
	private void test4() {
		System.out.println("Test4");
	}
	@Test(priority=5)
	private void test5() {
		System.out.println("Test5");
	}
	@Test(priority=1)
	private void test6() {
		System.out.println("Test6");
	
	}
}
