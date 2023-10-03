package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDrop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		Actions actions=new Actions(driver);
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        WebElement forex=driver.findElement(By.xpath("//a[normalize-space()='Forex']"));
		driver.findElement(By.xpath("//span[normalize-space()='Accounts']")).click();
		Thread.sleep(2000);
		//forex.click();
		actions.moveToElement(forex).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='Send Money Abroad']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[normalize-space()='Expense Types']")).click();
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		driver.quit();
		
		

	}

}
