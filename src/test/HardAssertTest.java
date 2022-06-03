package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertTest {

	@Test
	public void test1()
	{
		System.out.println("Open browser");
				
		// Here we are putting hard assert, in case as Assertion got failed, so next test steps will not be executed, and TC will be marked as failed		
		// Program will be terminated
		// Sometime we need to use Hard Assert as well, say as if browser is not getting launched then no points in entering the user name / password		
		Assert.assertEquals(true,true); // Hard Assert
		System.out.println("Enter username");
		System.out.println("Enter password");	
		System.out.println("Click on the signin button");
		System.out.println("Validate homepage");	
		// Hard Assert
		Assert.assertEquals(true,true); // Hard Assert
		System.out.println("Go to deals page");		
		Assert.assertEquals(true,false); //  Hard Assert
		System.out.println("Go to contact page");
		System.out.println("Go to leads page");
		
		
	}
}
