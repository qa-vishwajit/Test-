package Test2.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 
{
	@FindBy(xpath="//input[@placeholder='Search for anything']")private WebElement searchHere;
	@FindBy(xpath="//input[@type='submit'][@value='Search']")private WebElement searchClick;
	
	public pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchKey(String searchElement1)
	{
		searchHere.sendKeys(searchElement1);
	}
	public void searchbutton()
	{
		searchClick.click();
	}
}
