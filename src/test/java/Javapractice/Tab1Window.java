package Javapractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab1Window {

	static WebDriver driver;
	static Set<String> allwindows;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String originalwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[normalize-space()='SeleniumTutorial']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.blogger.com']")).click();
		
		allwindows=driver.getWindowHandles();
		
		switchToWindow(allwindows,"Blogger.com - Create a unique and beautiful blog easily.");
		driver.findElements(By.xpath("//a[normalize-space()='Create your blog']")).get(1).click();
		Thread.sleep(2000);
		
		
		switchToWindow(allwindows,"Selenium143");
		driver.findElement(By.xpath("//a[normalize-space()='What is Selenium?']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(originalwindow);
		driver.findElement(By.name("q")).sendKeys("Arun Motoori");
		Thread.sleep(2000);
		
		driver.quit();
	}

	private static void switchToWindow(Set<String> openwindows, String tittle) {
		
		for(String wd:openwindows ) {
			
			if(driver.switchTo().window(wd).getTitle().equals(tittle)){
				break;
				
			}
		}
		
	}

}
