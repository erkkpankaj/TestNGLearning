package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {

	@BeforeMethod
	public void bMethod() {
		// TODO Auto-generated method stub
		System.out.println("@BeforeMethod: It will be executed before executing each method of this class..!!");
	}

	@Test
	public void webLoginCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("Web login for Car loan..!!");
	}

	@Test
	public void mobileLoginCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("Mobile login for Car loan..!!");
	}

	@AfterMethod
	public void aMethod() {
		// TODO Auto-generated method stub
		System.out.println("@AfterMethod: It will be executed after executing every method of this class..!!");
	}

	@Test
	public void apiLoginCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("API login for Car loan..!!");
	}

}
