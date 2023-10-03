package Javapractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownvaluetest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramesh");;
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pathan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("@!#$%^&123a");
		
	/*	Select sel1=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		sel1.selectByVisibleText("17");
		
		Select sel2=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		sel2.selectByVisibleText("Feb");
		Select sel3=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		sel3.selectByVisibleText("1990"); */
		
		WebElement bday=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement bmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement byear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Selectdropdown(bday,"17");
		Selectdropdown(bmonth,"Feb");
		Selectdropdown(byear,"1990");
		
		
		driver.findElement(By.xpath("//input[@name='sex'][@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(4000);
		driver.quit();
		
	}	
		
		public static void Selectdropdown(WebElement locator,String value) {
			
			Select sel=new Select(locator);
			sel.selectByVisibleText(value);
			
		}
		

}
