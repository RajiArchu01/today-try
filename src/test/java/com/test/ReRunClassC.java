package com.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunClassC implements IRetryAnalyzer {
	int min=0; int max=6;
public boolean retry(ITestResult result) {
	if(min<max) {
		min++;
		return true;
	}
	return false;
	}
}
