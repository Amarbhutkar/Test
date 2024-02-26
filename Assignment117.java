package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment117 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("AmarBhutkar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("name123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("1422223");
		Thread.sleep(3000);
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]")).sendKeys("amar");
		Thread.sleep(2000);
		driver.findElement(By.name("lname")).sendKeys("bhutkar");
		Thread.sleep(2500);
		driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]")).click();
		driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click();

	}

}
