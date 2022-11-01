package Test2.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 
{
	@FindBy(xpath="//select[@aria-label='Select a category for search']")private WebElement SelectCategory;
	@FindBy(xpath="//option[text()=' Computers/Tablets & Networking']") private WebElement Computers;
	@FindBy(xpath="//input[@class='btn btn-prim gh-spr']")private WebElement search;
	
	
	
	public pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelectCat()
	{
		SelectCategory.click();
	}
	public void SelectComp()
	{
		Computers.click();
	}
	public void SearchClick()
	{
		search.click();
	}
}
