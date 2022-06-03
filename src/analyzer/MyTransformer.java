package analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

//Its way to re-execute the TCs @ Suite level, means it will check that how many TCs got failed, and re-execute those again 
public class MyTransformer implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) 
	{
	annotation.setRetryAnalyzer(ReTryAnalyzer.class);	
		
	}

}
