package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void webLoginHomeLoan() {
		// TODO Auto-generated method stub
		System.out.println("Web login for Home loan..!!");
	}

	
	@Test(timeOut=5000)
	public void androidEmulatorStart() {
		// TODO Auto-generated method stub
		System.out.println("Starting the Android Emulator..!!");
	}
	
	@Test
	public void xLaunchAppium() {
		// TODO Auto-generated method stub
		System.out.println("XAppium server started..!!");
	}
	
	
	@Test(dependsOnMethods= {"xLaunchAppium"})
	public void mobileLoginCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("Mobile login for Home loan..!!");
	}

	@Test(enabled=false)
	public void apiLoginCarLoan() {
		// TODO Auto-generated method stub
		System.out.println("API login for Home loan..!!"); 
	}

}
