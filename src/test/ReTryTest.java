package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import analyzer.ReTryAnalyzer;

public class ReTryTest {

	// Say as there are few TCs which are getting failed due to browser crash, we want to give these to another try for few more time
	// Its re-try logic for failure TCs 
	// Its way to check the re-execution @ Test level
	
	@Test
	public void test1()
	{		
		Assert.assertEquals(true,false);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true,false);
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true,true);
	}
}
