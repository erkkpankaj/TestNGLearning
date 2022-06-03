package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	// Create the object of SoftAssert class
	SoftAssert soAsrt = new SoftAssert();
	@Test
	public void test1()
	{		
		System.out.println("Open browser");
		// Here we are putting soft assert, in case any Assertion got failed, so next test steps will be executed, program will not be terminated
		// Sometime we need to use Sort Assert, say as if home page title is not correct but we we still want to continue with next test steps		
		System.out.println("Enter username");
		System.out.println("Enter password");	
		System.out.println("Click on the signin button");
		System.out.println("Validate homepage");	
		soAsrt.assertEquals(true,false); // Soft Assert, here true is not equals to false, but still next test steps gets executed
		System.out.println("Go to deals page");		
		System.out.println("Go to contact page");
		soAsrt.assertEquals(true,false);
		System.out.println("Go to leads page");
		soAsrt.assertEquals(true,false);
		
		// Although the test steps got passed, but ideally TC should be marked as failed, as there are 3 soft assert got failed
		// To solve this issue use, write this line at the end of TC:: soAsrt.assertAll();
		
		soAsrt.assertAll();			
	}
	
	@Test
	public void test2()
	{
		System.out.println("Logout");
		soAsrt.assertEquals(true,false); // Soft Assert, here true is not equals to false, but still next test steps gets executed
		soAsrt.assertAll();
	}
	
	
	@AfterClass
	public void test3()
	{
		System.out.println("Teardown");
		// soAsrt.assertAll(); // This is not the correct approach to keep  the arrestAll() in @AfterClass
	}	
	
	
	/* NOTE: There is one issue while keeping a single object for SoftAssert class, so all the failed test steps details will be stored in that 
	so as there are 3 Soft Assert , hence in logs : 
	FAILED: test1
	java.lang.AssertionError: The following asserts failed:
	expected [false] but found [true],
	expected [false] but found [true],
	expected [false] but found [true]
	
	BUT for TC2 there was only 1 Soft Assert was there, but it shows 4 (because its taking the reference for 3 Soft Assert from test1)
	
	FAILED: test2
	java.lang.AssertionError: The following asserts failed:
	expected [false] but found [true],
	expected [false] but found [true],
	expected [false] but found [true],
	expected [false] but found [true]
	
	so good practice is to keep the separate object of SoftAssert for each test case.
	
	*/
	
}
