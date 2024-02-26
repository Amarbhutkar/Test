package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//Q. Launch Flipkart hover over fashion and click on men's T-shirt
public class Assignment131 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement f = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(f).perform();
		
		Thread.sleep(2000);
		
		WebElement f1 = driver.findElement(By.linkText("Men's Ethnic Sets"));
		f1.click();
		

	}

}
