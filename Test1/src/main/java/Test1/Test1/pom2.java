package Test1.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {

	@FindBy(xpath="//a[text()='Cell Phones & Smartphones']")private WebElement cellphone;
	@FindBy(xpath="(//button[@class='btn btn--small'])[1]")private WebElement navigate;
	@FindBy(xpath="//div[@class='x-overlay__wrapper--left']")private WebElement drop;
	@FindBy(xpath="//span[@class='x-overlay-aspect__label'][text()='Screen Size']")private WebElement filter1;
	@FindBy(xpath="//input[@class='checkbox__control']")private WebElement filter2;
	@FindBy(xpath="//div[@id='c3-mainPanel-price']")private WebElement filter3 ;
	@FindBy(xpath="//input[@aria-label='Minimum Value, US Dollar']")private WebElement minvalue;
	@FindBy(xpath="//input[@aria-label='Maximum Value, US Dollar']")private WebElement maxvalue;
	@FindBy(xpath="//span[text()='Item Location']")private WebElement filter4;
	@FindBy(xpath="(//input[@class='radio__control'])[2]")private WebElement filter5;
	@FindBy(xpath="//button[text()='Apply']")private WebElement filter6;
	@FindBy(xpath="(//div[@class='x-flyout brm__flyout brm__flyout--selected']//button[@class='x-flyout__button'])[1]")private WebElement verify3;
	
	
	public pom2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enter_pin()
	{
		cellphone.click();
	}
	
	public void button()
	{
		navigate.click();
	}
	
	public void dropDown(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(filter1).click().perform();
		act.moveToElement(filter2).click().perform(); 
		
		act.moveToElement(filter3).click().perform(); 
		act.moveToElement(minvalue).click().sendKeys("100").build().perform();
		
		act.moveToElement(maxvalue).click().sendKeys("1000").build().perform();
		
		act.moveToElement(filter4).click().perform();
		act.moveToElement(filter5).click().perform();
		act.moveToElement(filter6).click().perform();
		
	}
	
	public String Verify3()
	{
		return verify3.getText();
	}
	
	

}
