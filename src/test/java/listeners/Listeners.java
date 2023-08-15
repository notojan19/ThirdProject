package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

import Resorce.Base;
import Utilities.ExtendReporter;

public class Listeners extends Base implements ITestListener {

	
	 WebDriver driver=null;
	 ExtentReports extentReport=ExtendReporter.getExtentReport();
	 ExtentTest extentTest;
	 ThreadLocal<ExtentTest> extentTestThread = new  ThreadLocal<ExtentTest>();
	 

	 @Override
		public void onTestStart(ITestResult result) {
			
			String testName=result.getName();
		extentTest =extentReport.createTest(testName+"executed started...");
		extentTestThread.set(extentTest);
			
		}
	 
	 @Override
		public void onTestSuccess(ITestResult result) {
			
			String testName=result.getName();
		 extentTestThread.get().log(Status.PASS,testName+"got passed");
		
			
			
			}
		
		@Override
		public void onFinish(ITestContext context) {
			extentReport.flush();
			
		}	
		


	@Override
	public void onStart(ITestContext context) {
		
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testMethodName=result.getName();
		 extentTestThread.get().fail(result.getThrowable());
       
			
			try {
				 driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
				
			} catch (IllegalArgumentException|IllegalAccessException|NoSuchFieldException|SecurityException e1) {
				e1.printStackTrace();
			
			}
			try {
			String screnshotfilePath=	takeScreenShot(testMethodName, driver);
			extentTestThread.get().addScreenCaptureFromPath(screnshotfilePath,testMethodName);
				
			} catch (IOException e) {
				e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	
	
}
	

