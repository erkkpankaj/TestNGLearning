package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Parameters({ "URL", "APIKey" })
	@Test
	public void test1(String urlName, String apikey) {
		// TODO Auto-generated method stub
		System.out.println("This is Day1 test case..!!");
		System.out.println("URL name is  " + urlName);
		System.out.println("API key is  " + apikey);
	}

	@Test
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("This is Day1 test case2..!!");
	}

	
	@Test
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("This is Day1 test case3..!!");
		Assert.assertTrue(false);
	}
	@Test(dataProvider = "getData")
	public void test3(String uname, String pswd) {
		// TODO Auto-generated method stub
		System.out.println("Username is : " + uname);
		System.out.println("Password is : " + pswd);
	}

	// Passing different data set using @DataProvider
	@DataProvider
	public Object[][] getData() {
		// 1st combination - username password - good credit history= row
		// 2nd - username password - no credit history
		// 3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		// 1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";
		// Columns in the row are nothing but values for that particular combination(row)

		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		return data;
	}
}
