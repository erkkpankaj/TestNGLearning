package test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=5)
	public void test()
	{
		int num1 =10;
		int num2=20;
		int sum = num1 + num2;
		System.out.println("Sum of numbers is :: " + sum);
	}
}
