package Javapractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePractice {

	public static void main(String[] args) {
		
		//input[@type='submit']
		//input[@name='username']
		//input[@name='password']
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Selenium_50");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@123456");		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		System.out.println(driver.getTitle());
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[normalize-space()='Schedule Call']")).click();
		System.out.println("clicked on schedule call");
		driver.quit();
	}
}	
