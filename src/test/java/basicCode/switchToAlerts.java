package basicCode;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class switchToAlerts {
	
	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//div[3]//div[1]//div[2]//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert a= driver.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		
		
		
		driver.findElement(By.id("timerAlertButton")).click();
		//Thread.sleep(6000);   // not working without this wait. implicit wait not working.
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(6));
		mywait.until(ExpectedConditions.alertIsPresent());
		Alert b= driver.switchTo().alert();
		b.accept();
		
		
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		Alert c=driver.switchTo().alert();
//		c.accept();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmButton")).click();
//		c.dismiss();
		
		
		driver.quit();
		}
	}

