package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	/*	List<WebElement> allfooter=driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a"));
		
		for(WebElement footer:allfooter) {
			//System.out.println(footer.getAttribute("href"));
			System.out.println(footer.getText());
		} */

	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//span[normalize-space()='Claim']
		driver.findElement(By.xpath("//span[normalize-space()='Claim']")).click();
		
		WebElement eventnamae=driver.findElement(By.xpath("//label[normalize-space()='Event Name']"));
		WebElement status=driver.findElement(By.xpath("//label[normalize-space()='Status']"));
		
		driver.findElement(RelativeLocator.with(By.className("oxd-select-text-input")).below(eventnamae)).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
