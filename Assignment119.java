package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment119 {
	
	//Q. launch amazon.in select category dropdown,select Books using arrow down key then search for software in search text field and press enter using keys function.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		WebElement d= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		for(int i=0;i<=10;i++)
		{
			d.sendKeys(Keys.ARROW_DOWN);
		}
		
		d.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
