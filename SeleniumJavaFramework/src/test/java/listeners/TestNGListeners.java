package listeners;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener{

	public void onTestStart(ITestResult result) {
		System.out.println("******* Test Started : "+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("******* Test Success : "+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("******* Test Failed : "+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("******* Test Skipped : "+result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("******* Test Skipped : "+result.getName());
	}
	public void onStart(ITestContext context) {
		//System.out.println("******* Test Start : "+context.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("******* Test Completed : "+context.getName());
	}
	
}