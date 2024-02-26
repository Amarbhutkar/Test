package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.id("fname"));
		firstname.sendKeys("amar");
		WebElement lastname = driver.findElement(By.id("lname"));
		lastname.sendKeys("bhutakr");
		WebElement UN = driver.findElement(By.id("Username"));
		UN.sendKeys("amarbhutkar");
		WebElement P = driver.findElement(By.id("password"));
		P.sendKeys("112232324");
		WebElement checkb = driver.findElement(By.id("Male"));
		checkb.click();
		WebElement DD1 = driver.findElement(By.id("Skills"));
		Select s=new Select(DD1);
		s.selectByIndex(2);
		
		WebElement DD2 = driver.findElement(By.id("Country"));
		Select s1=new Select(DD2);
		s1.selectByValue("Bhutan");
		
		WebElement n=driver.findElement(By.name("w3review"));
		n.sendKeys("Sr.No2, Ramchandra Nagar");
		
		WebElement n1=driver.findElement(By.name("w3review"));
		n1.sendKeys("Dhankawadi");
		
		WebElement Pin = driver.findElement(By.name("Pincode"));
		Pin.sendKeys("144111");
		
		WebElement i=driver.findElement(By.id("Relegion"));
		Select s3=new Select(i);
		s3.selectByVisibleText("Jews");
		
		WebElement file=driver.findElement(By.id("Resume"));
		file.sendKeys("C:\\Users\\user\\Desktop\\12333.pdf");
		
		WebElement check1 = driver.findElement(By.id("Agree"));
		check1.click();

	}

}
