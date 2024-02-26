package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment113 {
	
	// Q. Launch Amazon Sign in page and login with Credentials.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.name("nav-a nav-a-2   nav-progressive-attribute")).click();
		
		
		
		
		

	}

}
