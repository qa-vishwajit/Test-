package Test1.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {

	@FindBy(xpath="//div[@id='gh-shop']")private WebElement shop;
	@FindBy(xpath="//a[text()='Cell phones & accessories']")private WebElement electronics;
	
	
	public pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enter_pin()
	{
		shop.click();
	}
	
	public void button()
	{
		electronics.click();
	}
}
