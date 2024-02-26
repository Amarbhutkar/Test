package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment128 {
	
	//Q. After handling popup in grotechmind app find title of page

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new  ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
	System.out.println(driver.getTitle());	
		
		
		

	}

}
