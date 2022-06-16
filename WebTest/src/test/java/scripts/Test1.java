package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.ReadExcel;

public class Test1 extends BaseTest{
	
	@Test
	public void titleTest()
	{
		String x = driver.getTitle();
		Reporter.log(x,true);
		
//		String v = ReadExcel.getData("./testData/input.xlsx", "sheet1", 0, 0);
//		Reporter.log(v,true);
	}
}
