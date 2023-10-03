package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPracticeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://licindia.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login=driver.findElement(By.xpath("//a[@title='Login']"));
		act.moveToElement(login).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Customer Portal']")).click();
		String alert=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println("Tittle of the Alert :"+alert);
		System.out.println("Navigated to new page: "+driver.getTitle());
		
		driver.quit();
		
			
	}

}
