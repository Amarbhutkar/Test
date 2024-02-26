package Assignment144;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 extends LaunchandClose {
	
//	String child_Title =driver.getTitle();
//	System.out.println(child_Title);
//	WebElement hover = driver.findElement(By.linkText("  Not amar? Sign Out"));
//	Actions a1=new Actions(driver);
//	a1.moveToElement(hover).perform();
	
	
	@Test
	public void method1() throws InterruptedException
	{
		WebElement name = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(name).perform();
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.xpath("//span[.='Sign in'][1]"));
		signin.click();
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("amarbhutkar007@gmail.com");
		WebElement userid = driver.findElement(By.id("continue"));
		userid.click();
		WebElement p=driver.findElement(By.name("password"));
		p.sendKeys("Reflex@1234");
		WebElement s=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		s.click();
		
		WebElement b = driver.findElement(By.id("twotabsearchtextbox"));
		b.sendKeys("iphone 15 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		 String child_Title =driver.getTitle();
			System.out.println(child_Title);
			WebElement hover = driver.findElement(By.linkText("Not amar? Sign Out"));
			Actions a1=new Actions(driver);
			a1.moveToElement(hover).perform();
		
	}
	
	

	
	
	
	
	
	

}
