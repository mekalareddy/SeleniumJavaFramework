package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo2 {
	
	@Test
	public void test4() {
		System.out.println("I am inside test 4");
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside test 5");
		AssertJUnit.assertTrue(false);
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside test 6");
		throw new SkipException("this test is skipped");
	}
		
}