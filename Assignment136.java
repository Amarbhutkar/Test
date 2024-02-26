package SeleniumAssignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment136 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		FileInputStream f= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\JavaSelenium\\Excelsheet\\amar.xlsx.xlsx"); 
		Workbook wb = WorkbookFactory.create(f);
		String r = wb.getSheet("Login").getRow(2).getCell(0).getStringCellValue();
		String c=wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
		String d=NumberToTextConverter.toText(wb.getSheet("Login").getRow(2).getCell(2).getNumericCellValue());
		//String d = wb.getSheet("Login").getRow(2).getCell(2).getStringCellValue();
		EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement hover = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(hover).perform();
		WebElement login = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		login.click();
		
		WebElement create_account = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		create_account.click();
		
		WebElement customer_name = driver.findElement(By.xpath("//input[@name='customerName']"));
	    customer_name.sendKeys(r);
	    
	   WebElement mobile_number = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
	   mobile_number.sendKeys(d);
	   
	  WebElement pass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys(c);
		
		WebElement verify = driver.findElement(By.xpath("//input[@id='continue']"));
        verify.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
