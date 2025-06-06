package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits_sync {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	
		Thread.sleep(4000);
		
		//Click on link and start button
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='start']//button")).click();

		//Explicit wait until loading is completed.
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(6));
		mywait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='finish']//h4"))));
		
		//Get text
		String finish_text = driver.findElement(By.xpath("//div[@id='finish']//h4")).getText();
		System.out.println("text " + finish_text);

		driver.quit();
	}

}
