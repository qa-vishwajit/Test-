package Test2.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 
{

	
	@FindBy(xpath="(//span[@role='heading'])[2]")private WebElement FirstResult;
	public pom3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getFirstResult()
	{
		return FirstResult.getText();
	}
}
