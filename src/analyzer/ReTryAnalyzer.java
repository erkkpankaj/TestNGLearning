package analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


// Its way to re-execute the TCs @ Test level
public class ReTryAnalyzer implements IRetryAnalyzer {

	int counter = 0;
	int reTryLimit = 3;
	
	public boolean retry(ITestResult result)
	{
		if(counter <reTryLimit) 
		{
			counter++;
		return true;
	}
	return false;		
		
	}
		
}
