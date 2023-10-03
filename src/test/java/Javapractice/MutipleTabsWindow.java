package Javapractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleTabsWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> multilinks=driver.findElements(By.xpath("//a[contains(@href,'com/')]"));
		
		for(WebElement ml:multilinks) {
		
			 ml.click();
			 System.out.println("switched to window: "+ml.getAttribute("href"));

	    }
		Thread.sleep(7000);
       driver.quit();
}

}