package com.test;

import org.testng.annotations.Test;

public class SuiteLevelExecution {
	@Test
	private void test1() {
		System.out.println("Test1");
	}
	@Test
	private void test2() {
		System.out.println("Test2");
	}
	@Test
    private void test3() {
		System.out.println("Test3");
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
