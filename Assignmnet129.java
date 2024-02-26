package SeleniumAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

//Handle javascript popup of growtechminds application and get the title of the page

public class Assignmnet129 {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
         Thread.sleep(2000);
        System.out.println(driver.getTitle()); 
	
		
		
		
		
		
		
		
		
		

	}

}
