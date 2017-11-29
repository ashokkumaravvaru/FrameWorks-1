package com.rameshsoft.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryTest implements IRetryAnalyzer{
	int retryCount=0;
	int maxCount=5;
		@Override
		public boolean retry(ITestResult result) {
			if (result.getStatus()==ITestResult.FAILURE &&retryCount<=maxCount) {
				
				try {
					Thread.sleep(5000);
	System.out.println("retry count is : " +retryCount+"....executing.. " +result.getName());
	retryCount++;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return true;
			}
			return false;
		}

}
