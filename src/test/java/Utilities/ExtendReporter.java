package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporter {
	
static	ExtentReports extentReport;
	
	
	public static ExtentReports getExtentReport() {
		
		String extentReportPath=System.getProperty("user.dir")+"/reports/extentreport.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("OrangeHRM Automation Results");
		reporter.config().setDocumentTitle("TestResult");
		
		extentReport= new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Operating System","MacOs");
		extentReport.setSystemInfo("Tested By","Shukur Rahman");
		
		return extentReport;
	}
	
	

}
