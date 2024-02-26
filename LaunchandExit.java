package Assignment146;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandExit {
	
	WebDriver driver;
	
	@BeforeMethod()
	public void method1()
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
