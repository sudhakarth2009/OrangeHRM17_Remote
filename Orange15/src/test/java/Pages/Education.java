package  Pages;
//import MercuryDemoTours;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import HTMLReport.Reporter1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Education
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	
	
	 
	 Reporter1 R1;

	
	public void  Education(WebDriver driver,Reporter1 R1 )throws Exception
	{  
		this.driver=driver;
		this.R1=R1;
	}
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception {
		
	    WebElement elem = driver.findElement(by);
	    	    
	    // draw a border around the found element
	    if (driver instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	        
	  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
	        
	    }
	    return elem;
	}
	
	
	
	
	
	



public   void AddEducation(String Educationdetails )throws Exception
{  
	

	try 
	{
	
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Qualifications")).click();
		
		findElement(By.linkText("Education")).click();
		R1.TakeScreenShotAuto(driver,"Education Page Details","Pass");
	 	
	
	} 
	catch(NoSuchElementException e)
	{
		System.out.println("Error Message :"+e.getMessage());
		 R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
	}
 	catch(NoSuchFrameException  e)
	{
		System.out.println("Error Message :"+e.getMessage());
		 R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
	}
 	
	 
	
 
}
	
	
		 


		 
}
	


	
	