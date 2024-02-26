package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Q. Launch growtechminds drag and drop page,do drag a image and drop it in target place,do the reverse of it.

public class Assignemnt132 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("drag11"));
		WebElement drop = driver.findElement(By.id("div2"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		
		WebElement drag1=driver.findElement(By.id("drag11"));
	WebElement drop1 = driver.findElement(By.xpath("(//div[@id='div1'])[11]"));
	Actions a2=new Actions(driver);
	a2.dragAndDrop(drag1, drop1).perform();
		
		
		

	}

}
