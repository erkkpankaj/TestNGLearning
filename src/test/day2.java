package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@AfterSuite
	public void aSuite() {
		// TODO Auto-generated method stub
		System.out.println("@AfterSuite: This will exected after all TCs executed in test suite..!!");
	}
	
	@Test(groups={"Smoke"})
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Day2: This is smoke test 1..!!");
	}
	
	@Parameters({"URL"})
	@Test
	public void test2(String urlName) {
		// TODO Auto-generated method stub
		System.out.println("Day2: This is smoke test 2..!!");
		System.out.println("URL name is  " + urlName);
	}
	
	@Test(groups={"Smoke"})
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("Day2: This is smoke test 3..!!");
	}
	
	@BeforeSuite
	public void bSuite() {
		// TODO Auto-generated method stub
		System.out.println("@BeforeSuite: This is executed before executing any TCs in suite..!!");
	}
	
	@Test(dataProvider="getData")
	public void test2(String uname, String pswd) {
		// TODO Auto-generated method stub 
		System.out.println("Username is : " + uname);
		System.out.println("Passwordis : " + pswd);

	} 
	
	//Passing different data set 
	@DataProvider
	public Object getData()
	{
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0]="username1";
		data[0][1]="password1";
		
		//2nd set
		data[1][0]="username2";
		data[1][1]="password2";
		
		//3rd set
		data[2][0]="username3";
		data[2][1]="password3";				
		
		return data;
	}
}
