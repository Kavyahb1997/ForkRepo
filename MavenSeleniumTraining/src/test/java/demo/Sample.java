package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void login()
	{
		Reporter.log("sample executed",true);
	}

}
