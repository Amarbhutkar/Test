package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Q. Launch online sbi link,click on login button, and inspect username,password and captcha

public class Assignment130 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		WebElement log = driver.findElement(By.linkText("LOGIN"));
		log.click();
		Thread.sleep(2000);
		
		WebElement log1 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		log1.click();
		Thread.sleep(2000);
		
		WebElement log2=driver.findElement(By.xpath("//input[@name='userName']"));
		log2.sendKeys("amasdas");
		
		WebElement log3=driver.findElement(By.xpath("//input[@name='password']"));
		log3.sendKeys("amasdas");
		
		WebElement log4=driver.findElement(By.xpath("//input[@name='loginCaptchaValue']"));
		log4.sendKeys("km4c2");
		
		
		
		

	}

}
