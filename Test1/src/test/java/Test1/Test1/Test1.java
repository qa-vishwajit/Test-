package Test1.Test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;


import util.baseClass;

public class Test1 extends baseClass {
	
	pom1 cl;
	pom2 c2;
	
	@BeforeClass
	public void intilizeBrowser()
	{
		initilize_browser();
		cl= new pom1(driver);
		c2=new pom2(driver);
		
	}
	
	@BeforeMethod
	public void perform() throws InterruptedException
	{
		cl.enter_pin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		cl.button();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c2.enter_pin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c2.button();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		c2.dropDown(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//c2.Button();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	@SuppressWarnings({ "deprecation", "deprecation" })
	@org.testng.annotations.Test
	public void Test()
	{
		
		
		String actual3=c2.Verify3();
		System.out.println(actual3);
		String expected3="3 filters applied";
		
		
		Assert.assertEquals(actual3, expected3,"test failed data is not matches");
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
