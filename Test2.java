package Assignment144;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test2 extends LaunchandClose {
	
	@Test
	public void method2()
	
	{
		
	    String child_Title =driver.getTitle();
		System.out.println(child_Title);
		WebElement hover = driver.findElement(By.linkText("  Not amar? Sign Out"));
		Actions a1=new Actions(driver);
		a1.moveToElement(hover).perform();
		
		
		
		
		
	}
	
	
	
	
	
	

}
