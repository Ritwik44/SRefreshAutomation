package Javapractice;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sortingTable {

	@Test
	public static void columnsorting() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	//	clicking on column header to sort
		driver.findElement(By.xpath("//span[normalize-space()='Veg/fruit name']")).click();
	
	//	storing the first column values in a list
		List<WebElement> firstcolumnlist=driver.findElements(By.xpath("//tbody//tr/td[1]"));
		
   //   Retrieving the text values for first column and storing in a list 
		List<String> originalelements=firstcolumnlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
   //   sorting the above lists
		List<String> sortedelements=originalelements.stream().sorted().collect(Collectors.toList());  
	    
	// comparing the sorted lists vs original text
		//  Assert.assertEquals(originalelements, sortedelements);
	//    Assert.assertTrue(originalelements.equals(sortedelements));
	    
	    
	    firstcolumnlist.stream().filter(s->s.getText().contains("Rice")).map(s->By.xpath("following-sibling::td[1])")).
	    		forEach(e->System.out.println(e));
	    
	    driver.quit();

	}

}
