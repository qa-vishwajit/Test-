package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilize_test_data 
{
	
	
	
	public static void ScreenShot(WebDriver driver) throws IOException
	{
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(file);
		File dest=new File("C://Users//Vishwajit//eclipse-workspa'ce//Test1//screenshots//sample1.jpg");
		FileHandler.copy(file , dest );
		
		
	}


	
	

}
