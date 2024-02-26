package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment120 {
	
	// Q. Launch GrowTechminds registraion form,for firstname textfield enter name as Manish Kumar Tiwari,remove Tiwari from it using Keys option

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/career/");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.name("your-name"));
		a.sendKeys("Amar Bhutkar");
		System.out.println(a);
		
		for(int i=0;i<8;i++)
		{
			a.sendKeys(Keys.BACK_SPACE);
		}
		
		driver.quit();
		
		

	}

}
