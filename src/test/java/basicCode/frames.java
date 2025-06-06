package basicCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//count of frames
		List<WebElement> framelist = driver.findElements(By.xpath("//frame"));
		int count = framelist.size();
		System.out.println(count);
	
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("hello");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']")));
		
		String Heading_Text = driver.findElement(By.xpath("//div[text()='Form Filling Demo Page']")).getText();
		System.out.println(Heading_Text);
		Thread.sleep(200000);


		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_4.html']")));
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys(Heading_Text);
		Thread.sleep(3000);
		
		
		
		
		
		driver.quit();

	}

}
