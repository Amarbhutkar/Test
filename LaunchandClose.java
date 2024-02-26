package Assignment144;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandClose {
	WebDriver driver;

	@BeforeMethod
	public void login()
	{
		
		driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void logout()
	{
	    driver.quit();
		
	}
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
}

