package Javapractice;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingFunctional1 {

	@Test
	public void lowtohigh() throws InterruptedException {
	   
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   driver.findElement(By.id("login-button")).click();
	   
	   List<WebElement> allprices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	   List<String> pricetext=allprices.stream().map(s->s.getText().replaceAll("[$]"," ")).collect(Collectors.toList());
	   List<Double> pricedoble=pricetext.stream().map(s->Double.parseDouble(s)).sorted().collect(Collectors.toList());
//	   pricedoble.stream().forEach(s->System.out.println(s));
	   
	   Select sel=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
	   sel.selectByVisibleText("Price (low to high)");
	   
	   List<WebElement> allprices1=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	   List<String> pricetext1=allprices1.stream().map(s->s.getText().replaceAll("[$]"," ")).collect(Collectors.toList());
	   List<Double> pricedoble1=pricetext1.stream().map(s->Double.parseDouble(s)).collect(Collectors.toList());
	 //  pricedoble.stream().forEach(s->System.out.println(s));
	   
	   Assert.assertTrue(pricedoble.equals(pricedoble1));
	   
	   
	   Thread.sleep(5000);
	   driver.quit();
	}
	
	
	
	@Test
	public void sortbyname() throws InterruptedException {
		
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.findElement(By.id("user-name")).sendKeys("standard_user");
		   driver.findElement(By.id("password")).sendKeys("secret_sauce");
		   driver.findElement(By.id("login-button")).click();
		   
		   List<WebElement> itemname=driver.findElements(By.xpath("//div[@Class='inventory_item_name']")); 
		   List<String> itemdesc=itemname.stream().map(s->s.getText()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		   
		   Select sel=new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		   sel.selectByVisibleText("Name (Z to A)");
		   
		   List<WebElement> itemname1=driver.findElements(By.xpath("//div[@Class='inventory_item_name']")); 
		   List<String> itemdesc1=itemname1.stream().map(s->s.getText()).collect(Collectors.toList());
		   
		   Assert.assertTrue(itemdesc.equals(itemdesc1));
		   
		   Thread.sleep(5000);
		   driver.quit();
		   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



