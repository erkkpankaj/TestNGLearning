package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertForEachTest {
	
	@Test
	public void test1()
	{
		// Example of keeping the Object for SoftAsset seperatly for each test
		// Create the object of SoftAssert class
		SoftAssert soAsrt1 = new SoftAssert();
		
		System.out.println("Open browser");
		System.out.println("Enter username");
		System.out.println("Enter password");	
		System.out.println("Click on the signin button");
		System.out.println("Validate homepage");	
		soAsrt1.assertEquals(true,false); // Soft Assert, here true is not equals to false, but still next test steps gets executed
		System.out.println("Go to deals page");		
		System.out.println("Go to contact page");
		soAsrt1.assertEquals(true,false);
		System.out.println("Go to leads page");
		soAsrt1.assertEquals(true,false);	
		soAsrt1.assertAll();
				
	}
	
	@Test
	public void test2()
	{
		SoftAssert soAsrt2 = new SoftAssert();
		System.out.println("Logout");
		soAsrt2.assertEquals(true,false); // Soft Assert, here true is not equals to false, but still next test steps gets executed
		soAsrt2.assertAll();
	}
	
	// This is not the correct approach to keep  the arrestAll() in @AfterClass

	@AfterClass
	public void test3()
	{
		System.out.println("Teardown");		
	}	
	
	
	
}
