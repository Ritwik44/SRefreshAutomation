package Javapractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabWindow {

	public static void main(String[] args) throws InterruptedException {
		
		//GreenKart - veg and fruits kart
		//Free CRM software for customer relationship management, sales, and support.
		//Google.com
		
		WebDriver driver=new ChromeDriver();
     	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String originalwindow=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://classic.freecrm.com/index.html");
		
		
		Set<String> allwindows=driver.getWindowHandles();
		
		for(String wt:allwindows ) {
			
			if(driver.switchTo().window(wt).getTitle().equals("Google")) {
				
				driver.findElement(By.name("q")).sendKeys("Selenium");
				System.out.println(driver.getTitle());
				driver.close();
				
			}
			
			else if(driver.switchTo().window(wt).getTitle().equals("GreenKart - veg and fruits kart")) {
				driver.findElement(By.id("search-field")).sendKeys("Rice");
				System.out.println(driver.getTitle());
				driver.close();
			}
			
			else if(driver.switchTo().window(wt).getTitle().equals("Free CRM software for customer relationship management, sales, and support.")) {
				
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Selenium_50");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Abcd@123456");		
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		
		
		
	
		
//		driver.close();
		
    
		
		driver.quit();
		
	}

}
