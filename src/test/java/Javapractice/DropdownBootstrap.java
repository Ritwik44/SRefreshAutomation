package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropdownBootstrap {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='dropdown']")).click();
//	    driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li[2]")).click();
		
		//driver.findElement(By.xpath("//div[@class='drp2']")).click();
		List<WebElement> productType=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println(productType.size());
		
	/*	for(int i=0;i<productType.size();i++) {
			
		//	String value1=productType.get(i).getAttribute("value");
			String value1=productType.get(i).getText();
		//	System.out.println("dropdown value to chose:"+value1);
		/*	if(value1.equalsIgnoreCase("Accounts")) {
				System.out.println("dropdown value to chose:"+value1);
				productType.get(i).click();
				break;
			}*/
			
		
		for(WebElement ptype:productType ) {
			
			String value1=ptype.getText();
			if(value1.equalsIgnoreCase("Accounts")) {
				ptype.click();
				break;
			}
		}
		
	//	driver.findElement(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li[2]")).click();
	//	driver.findElement(By.xpath("//a[normalize-space() ='Apply online']")).click();
	
       
		Thread.sleep(4000);
		driver.quit();
		

	}

}