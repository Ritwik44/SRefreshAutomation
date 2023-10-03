package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//span[normalize-space()='Claim']
		driver.findElement(By.xpath("//span[normalize-space()='Claim']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-date-input'][1]")).click();
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")).click();
		
		List<WebElement> monthdropdown=driver.findElements(By.xpath("//ul[@class='oxd-calendar-dropdown']//li"));
		for(WebElement md:monthdropdown) {
			String month=md.getText();
			System.out.println(month);
		    if(month.equals("December")) {
				md.click();
				break;
			} 
		}
		
		driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/i")).click();
		List<WebElement> yeardropdown=driver.findElements(By.xpath("//ul[@class='oxd-calendar-dropdown']//li"));
		for(WebElement yd:yeardropdown) {
			String year=yd.getText();
			System.out.println(year);
		    if(year.equals("1999")) {
				yd.click();
				break;
			} 
		}
		
		
	List<WebElement> alldates=driver.findElements((By.xpath("//div[@class='oxd-calendar-dates-grid']//div[@class='oxd-calendar-date']")));
	 for(WebElement dt:alldates) {
		String date=dt.getText();
		System.out.println(date);
	   if(date.equals("27")) {
			dt.click();
			break;
		} 
	}
		
		
		
		/*  String Monthyear=driver.findElement(By.xpath("//ul[@class='oxd-calendar-selector']")).getText();
	   String month=Monthyear.split(" ")[0];
	   System.out.println(month); */
	   		
	/*	String month=driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']")).getText();
		System.out.println("Current selected Month: "+month);
		
		String year=driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']")).getText();
		System.out.println("Current selected year: "+year); */
		
		//button[@class='oxd-icon-button']
		
		Thread.sleep(5000);
		driver.quit();
	}

}
