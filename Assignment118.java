package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment118 {
	
	// Q. Login to facebook.com using xpath locator(Relative xpath)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amarbhutkar@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL+"c");		
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
		
		
		
		
		
	}

}
