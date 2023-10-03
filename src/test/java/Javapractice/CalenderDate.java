package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalenderDate {

	static WebDriver driver=new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		
	//	WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement popupcan=driver.findElement(By.xpath("//span[@class='sc-gKclnd hSnAGZ']"));
		popupcan.click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Departure']")).click();	
		
		selectCalenderDate("November","2023","25");
		driver.quit();
	}	
		
	
	public static void selectCalenderDate(String exmonth,String exyear,String date) throws InterruptedException {
	
		   String Monthyr=driver.findElement(By.xpath("//div[@role='heading']")).getText();
		   String month=Monthyr.split(" ")[0];
		   String year=Monthyr.split(" ")[1];
		
	        while(!(month.equals(exmonth) && year.equals(exyear))) {
			
	           driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			   Monthyr=driver.findElement(By.xpath("//div[@role='heading']")).getText();
			   month=Monthyr.split(" ")[0];
			   year=Monthyr.split(" ")[1];			
		}
	        //driver.findElement(By.xpath("//p[normalize-space()='"+date+"']")).click();
	       List<WebElement> days=driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']"));
	       for(WebElement e: days) {
	    	   
	    	   String day=e.getText();
	    	   if(day.equals(date)) {
	    		   e.click();
	    		   break;
	    	   }
	       }
	       
	       driver.findElement(By.xpath("//span[normalize-space()='Done']")).click();
	        Thread.sleep(5000);
	}

}
