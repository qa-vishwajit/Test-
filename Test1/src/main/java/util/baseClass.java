package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseClass {
	public WebDriver driver;
	public void initilize_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Chrome\\\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");		
		
		driver=new ChromeDriver(option);
		
		driver.get("https://www.ebay.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}

}
