package SeleniumAssignments;
//Launch grotechminds registration form and locate dropdowns skills,country and religion perform action on them

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skills_DD=driver.findElement(By.id("Skills"));
		Select s=new Select(skills_DD);
		s.selectByValue("select1");
		Thread.sleep(2000);
		WebElement Country_DD=driver.findElement(By.id("Country"));
		Select s1=new Select(Country_DD);
		s1.selectByIndex(4);
		Thread.sleep(2000);
		WebElement Religion_DD=driver.findElement(By.id("Relegion"));
		Select S2=new Select(Religion_DD);
		S2.selectByVisibleText("Jain");
		
		
		
		
		
		
		
		
		
		

	}

}
