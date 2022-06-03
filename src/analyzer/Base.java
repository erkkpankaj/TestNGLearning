package analyzer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;

	public static void initization() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\IVL_Selenium@2019\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\IVL_Selenium@2019\\TestNGTutorial\\Screenshots\\screen.jpg"));
	}

	/*public void faildTest() throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\IVL_Selenium@2019\\TestNGTutorial\\Screenshots\\screen.jpg"));
	}*/
}
