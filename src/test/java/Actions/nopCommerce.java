package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nopCommerce {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("J");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("test@yopmail.com");
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@id='register-button']")).click();	
		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
		
	}

}
