package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 

public class GoIbiboRadioButton {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.navigate().refresh();
	//	Thread.sleep(2000);
			
	//	driver.switchTo().frame(0);
		WebElement popupcan=driver.findElement(By.xpath("//span[@class='sc-gKclnd hSnAGZ']"));
		popupcan.click();
	//	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
	//	Thread.sleep(3000);
		
	/*	WebElement inputext=driver.findElement(By.xpath("//p[normalize-space()='Enter city or airport']"));
		inputext.click();
		
		WebElement frominput=driver.findElement(By.xpath("//input[@type='text']"));
		frominput.sendKeys("mumbai");
		driver.findElement(By.xpath("//ul[@id='autoSuggest-list']//li[1]")).click();
		
		WebElement toinput=driver.findElement(By.xpath("//input[@type='text']"));
		toinput.sendKeys("kolkata");
		driver.findElement(By.xpath("//ul[@id='autoSuggest-list']//li[1]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='student']")).click(); */
		driver.findElement(By.xpath("//span[normalize-space()='Departure']")).click();
		String Monthyr=driver.findElement(By.xpath("//div[@role='heading']")).getText();
		System.out.println(Monthyr);
		String month=Monthyr.split(" ")[0];
		String year=Monthyr.split(" ")[1];
		System.out.println(month);
		System.out.println(year);
		
		//span[normalize-space()='Departure']
	   
		//p[@class='fswFld__title']
		
		//span[normalize-space()='Done']
		
		//span[@aria-label='Next Month']
		
		
		
		
		
		
		
		
		/*	List<WebElement> auto=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li"));
		
		for(WebElement list: auto) {
			System.out.println(list.getText());
		}
		
		driver.findElement(By.xpath("//span[@class='sc-12foipm-1 jpXDbp']")).click();
		
	    //frominput.sendKeys(Keys.ENTER);
		//act.sendKeys(frominput,"mumbai");
		//act.sendKeys(Keys.ENTER); */
		Thread.sleep(4000); 
		
		
		
		
		//driver.switchTo().frame(popupcan);
		//popupcan.click();
		//js.executeScript("argument[0].click()", popupcan);
		//driver.switchTo().alert().dismiss();
		
		driver.quit();

	}

}
