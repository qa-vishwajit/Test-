package Test2.Test2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import util.baseClass;
import util.utilize_test_data;

public class Test2 extends baseClass
{
	pom1 c1;
	pom2 c2;
	pom3 c3;
	@BeforeClass
	public void intilizeBrowser()
	{
		initilize_browser();
		c1=new pom1(driver);
		c2=new pom2(driver);
		c3=new pom3(driver);
		
	}
	
	@BeforeMethod
	public void perform() throws InterruptedException, IOException
	{
		c1.enterSearchKey(utilize_test_data.getDataFromPF("searchElement"));
		c1.searchbutton();
		c2.SelectCat();
		c2.SelectComp();
		c2.SearchClick();
		
	
	}
	@Test
	public void Test() throws IOException
	
	{
		String ActualResult=c3.getFirstResult();
		String ExpectedResult=utilize_test_data.getDataFromPF("searchElement");
		if(ActualResult.contains(ExpectedResult))
		{
			Reporter.log("Actual Result matches Expected result:"+ExpectedResult, true);
		}
		
		
	}
	@AfterMethod
	public void logoutApplication(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			util.utilize_test_data.ScreenShot(driver);
		
		}
	}
	
	@AfterClass
	public void close_browser()
	{
		driver.close();
		
	}
}
