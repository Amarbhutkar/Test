package SeleniumAssignments;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Q. Get the title of flipkart.com and save each word in an array

public class Assignmnet111 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		String a[]= {"Arab Emirates", "United Kingdom"};
		for(int i=0;i<a.length;i++)
		{driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText(a[i])).click();
	
		
		
		
			
		}
			
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
