package com.test;

import org.testng.annotations.Test;

public class SkipTest {
	@Test
	private void test1() {
		System.out.println("Test1");
	}
	@Test(enabled=true)
	private void test2() {
		System.out.println("Test2");
	}
	@Test(enabled=false)
    private void test3() {
		System.out.println("Test3");
	}
	@Test(enabled=false)
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
