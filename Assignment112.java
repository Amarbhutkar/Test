package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Q. Login to Facebook using id,name locator

public class Assignment112 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("amab@fb.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("amar2323");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		
		
		
		
		

	}

}
