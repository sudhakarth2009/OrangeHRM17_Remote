package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import HTMLReport.Reporter1;

public class Languages {
 WebDriver driver;
	
	
	 
	 Reporter1 R1;

	
	public void  Languages(WebDriver driver,Reporter1 R1 )throws Exception
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
	
	
	
	
	
	



public   void LanguageDetails(String Languages )throws Exception
{  
	

	try 
	{
	
		//findElement(By.linkText("Admin")).click();
		//findElement(By.linkText("Nationalities")).click();
		
		
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		
		/*Actions actions = new Actions(driver);
		 actions.moveToElement(Admin).
		 moveToElement(Nationalities).click().build().perform();*/
		
		 
		//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//driver.switchTo().frame(frames.get(0));
		
		findElement(By.name("btnAdd")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		
		findElement(By.id("menu_admin_viewLanguages")).click();
		 findElement(By.id("btnAdd")).click();
		 findElement(By.id("language_name")).sendKeys(Languages);

		
	
	 R1.TakeScreenShotAuto(driver,"Language Entered","Pass");
	 
	 findElement(By.id("btnSave")).click();
	
	 
		WebElement Element2 = findElement(By.linkText(Languages));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element2);
		
		R1.TakeScreenShotAuto(driver,"Scroll Nationality ","Pass");
	
	 
		//driver.switchTo().defaultContent();

	 
	 	
	
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
