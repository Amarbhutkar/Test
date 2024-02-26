package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmnet121 {
	
	//Q. Launch GrowTechminds registraion form,locate every element except Dropdowns and Upload file button and perform action on each element using WebElement

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement Firstname=driver.findElement(By.id("fname"));
		Firstname.sendKeys("Amar");
		WebElement Lastname=driver.findElement(By.id("lname"));
	    Lastname.sendKeys("Bhutkar");
	    WebElement Username=driver.findElement(By.id("Username"));
	    Username.sendKeys("AmarB");
	    WebElement Pass=driver.findElement(By.id("password"));
	    Pass.sendKeys("3232323232");
	    WebElement DM=driver.findElement(By.id("Male"));
	    DM.click();
	    WebElement FM=driver.findElement(By.id("FeMale"));
	    FM.click();
	    Thread.sleep(2000);
	    WebElement dropD = driver.findElement(By.id("Skills"));
	    Select s=new Select(dropD);
	    s.selectByValue("select1");
	    Thread.sleep(2000);
	    WebElement dropD1 = driver.findElement(By.xpath("((//select[@id='technicalskills'])[1])"));
	    Select s1=new Select(dropD1);
	    s1.selectByIndex(6);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
