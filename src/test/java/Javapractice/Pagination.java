package Javapractice;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<String> vegprice;
		
		do {
			
		List<WebElement> vegcellall=driver.findElements(By.xpath("//tbody/tr/td[1]"));	
		vegprice=vegcellall.stream().filter(s->s.getText().contains("Strawberry")).map(s->getVegprice(s)).collect(Collectors.toList());	
		
		  if(vegprice.size()<1) {
			 driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		   }
			
		}while(vegprice.size()<1);
		
		vegprice.forEach(s->System.out.println(s));
		driver.quit();
	}	
		
	private static String getVegprice(WebElement s) {
			
			String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();			
			return pricevalue;
			
		}
		
	}


