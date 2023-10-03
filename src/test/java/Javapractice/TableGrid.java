package Javapractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TableGrid {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Claim']")).click();
		
		int rowno=driver.findElements(By.xpath("//div[@class='oxd-table-body']//div[@role='row']")).size();
		
		System.out.println("Total no of rows present in the table: "+rowno);
		
		List<WebElement> allcell=driver.findElements(By.xpath("//div[@class='oxd-table-body']//div[@role='row']//div[@role='cell']"));
		List<String> ename1=new ArrayList<String>();
		List<String> ename2=new ArrayList<String>();
		HashMap<String,Object> map=new HashMap<String,Object>();
		
		for(WebElement cell:allcell) {
			
		//	WebElement ename=driver.findElement(RelativeLocator.with(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/div")).toLeftOf(cell));
			String eventdata=cell.getText();
			
			if(eventdata.equalsIgnoreCase("Travel Allowance")) {
				WebElement ename=driver.findElement(RelativeLocator.with(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/div")).toLeftOf(cell));
				String employee=ename.getText();
				ename1.add(employee);
			}
			else if(eventdata.equalsIgnoreCase("Medical Reimbursement")) {
				WebElement ename=driver.findElement(RelativeLocator.with(By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/div")).toLeftOf(cell));
				String employee=ename.getText();
				ename2.add(employee);
				
			}
		}
		
		map.put("Travel Allowance",ename1);
		map.put("Medical Reimbursement",ename2);
		System.out.println("Employee name having Travel allowance event :"+map.get("Travel Allowance"));
		System.out.println("Employee name having  Medical Reimbursement event :"+map.get("Medical Reimbursement"));
		
		
		driver.quit();
			
		
		
		
	}

}
