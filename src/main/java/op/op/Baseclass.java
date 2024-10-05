package op.op;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get("https://ui.api1.wegofin.com/login");
		driver.manage().window().maximize();
	//	Automating login page
		
		Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Welcome,')]")).isDisplayed());
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("user1@yopmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("user@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.cssSelector("#nav-profile-tab")).click();
		
		
	//	Assert.assertTrue(driver.findElement(By.cssSelector("#nav-profile-tab")).isDisplayed());
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[contains(text(),'Success')])[6]")).click();
		
		 driver.findElement(By.id("run")).click();
		 
		 Thread.sleep(1000);
		 
		 Alert alert = driver.switchTo().alert();
		 alert.accept(); 
		 
	//	 Dynamic status changing failure to succsess then what code should be write there.
		 
		 driver.findElement(By.xpath("(//button[@id='check'])")).click();
		 Thread.sleep(1000);
		 Alert alert1 = driver.switchTo().alert();
		 alert1.accept(); 
		 
			driver.findElement(By.xpath("(//button[@id='resetButton'])")).click();
			
			 Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@id='api_dropdown']")).click();
			
			 Thread.sleep(1000);
			driver.findElement(By.xpath("//option[contains(text(),'ReqOtp')] ")).click();
			//select[@id='api_dropdown']//option[contains(text(),'ReqOtp')] 
			
			driver.findElement(By.id("run")).click();
			 
			 Thread.sleep(1000);
			 
			 Alert alert2 = driver.switchTo().alert();
			 alert2.accept(); 
			 
			 driver.findElement(By.xpath("(//button[@id='check'])")).click();
			 Thread.sleep(1000);
			 Alert alert3 = driver.switchTo().alert();
			 alert3.accept(); 
			 
			
			
	}
	//div[contains(text(),'Success')])[5]
}
