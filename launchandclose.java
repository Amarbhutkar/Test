package Assignment145;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launchandclose {

	
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
