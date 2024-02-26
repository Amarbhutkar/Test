package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment115 {
	// Q. Launch Google.com and click on gmail using linkText.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail (opens a new tab)")).click();
		
		
		
		
		
		
		

	}

}
