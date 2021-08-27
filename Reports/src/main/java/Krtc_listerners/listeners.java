package Krtc_listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class listeners extends ksrtc_Testcase implements ITestListener {
	ExtentReports extent = Extent_report.CreateTest();
	ExtentTest test;

	public void onFinish(ITestContext arg0) {
		extent.flush();
	}

	public void onStart(ITestContext arg0) {
		test = extent.createTest("KsrtcTestcase");
		test.assignAuthor("Vartika");
		test.assignCategory("Functional Testing");
		System.out.println("Test Started");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("100 percentage done");
	}

	public void onTestFailure(ITestResult arg0) {
		test.fail("Login Successfully not Executed");
		test.fail("Successfully unable Navigated to  itime page");
		test.fail("Timesheet data not saved Successfully");
		System.out.println("login is failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		// test.log(Status.PASS, markup);
	}

	public void onTestStart(ITestResult arg0) {

	}

	public void onTestSuccess(ITestResult arg0) {

		test.pass("Login Successfully Executed");
		test.pass("Successfully Navigated to itime page");
		test.pass("Timesheet data saved Successfully");
	}

}