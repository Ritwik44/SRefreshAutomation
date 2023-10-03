package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownvalutest2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//span[normalize-space()='Claim']
		driver.findElement(By.xpath("//span[normalize-space()='Claim']")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active'][1]")).click();
		
		System.out.println("Clicked on Event name dropdown");
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//span[normalize-space()='Accommodation']")).click();
		
		List<WebElement> dmenu1=driver.findElements(By.xpath("//div[@role='option']"));
		
		for(WebElement du:dmenu1 ) {
			String value=du.getText();
			if(value.equalsIgnoreCase("Accommodation")) {
			du.click();
			break;
		   }
		
		}	
			
		driver.findElement(By.xpath("//label[normalize-space()='Status']/parent::div/following-sibling::div")).click();
	    List<WebElement> dmenu2=driver.findElements(By.xpath("//div[@role='option']"));
		
		for(WebElement du:dmenu2 ) {
			String value=du.getText();
			if(value.equalsIgnoreCase("Approved")) {
			du.click();
			break;
		   }
		
		}	Thread.sleep(4000);
		
		driver.quit();

	}

}
