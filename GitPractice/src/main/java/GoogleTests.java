
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleTests {
	
     
	
	  WebDriver driver;   
      int i;
	
	@Test  (description = "verify the title of the page", priority=1) 
	public void verifyTitle()
	{

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.23.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();
         
		driver.get("http://www.google.com");
      
		String actual = driver.getTitle();
		String expected = "Google";
         //comparing titles
		Assert.assertEquals(actual, expected);
	}
	
	@Test(description="navigate go Gmail and verify title", priority=2)
	public void navigateToGmailPage()
	{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver.findElement(By.linkText("Gmail")).click();
		String actual = driver.getTitle();
		String expected = "Gmail - Free Storage and Email from Google";
		Assert.assertEquals(actual, expected);
		
	}
	

}
