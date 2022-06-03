package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import analyzer.Base;
import analyzer.CustomListeners;

@Listeners(CustomListeners.class)
public class ScreenshotTest extends Base{

	@BeforeMethod
	public void setup() throws IOException
	{
		initization();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void takeScreenShotTest()
	{
		Assert.assertEquals(false, true);
	}
	
}
