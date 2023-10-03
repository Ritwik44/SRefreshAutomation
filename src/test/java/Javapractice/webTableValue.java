package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class webTableValue {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[normalize-space()='Veg/fruit name']")).click();
		
		List<WebElement> allcellvalue=driver.findElements(By.xpath("//tbody//tr/td[1]"));
		
/*		for(WebElement wb:allcellvalue) {
			
			String fruit=wb.getText();
			if(fruit.equalsIgnoreCase("Banana")) {
				
			    WebElement price=driver.findElement(By.xpath("//td[normalize-space()='"+fruit+"']/following-sibling::td[1]"));
				System.out.println(price.getText());
				break;
			
			
		}  */
		
		WebElement price=driver.findElement(By.xpath("//td[normalize-space()='Brinjal']/following-sibling::td[1]"));
		System.out.println(price.getText()); 
		driver.quit();
	}

	}

