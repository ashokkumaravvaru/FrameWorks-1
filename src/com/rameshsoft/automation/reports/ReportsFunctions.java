package com.rameshsoft.automation.reports;


import com.rameshsoft.base.DriverEngine;
import com.rameshsoft.base.DriverUtility;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsFunctions 
{

	static public void logInfo(String stepDetails) 
	{
		DriverEngine.gettest().log(LogStatus.INFO, stepDetails);
	}
	
	public static void lginfo(String stepName,String stepDetails) {
		DriverEngine.gettest().log(LogStatus.INFO, stepName, stepDetails);
	}
	
}
