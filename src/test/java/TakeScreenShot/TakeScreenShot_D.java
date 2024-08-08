package TakeScreenShot;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.*;

import org.openqa.selenium.*;

public class TakeScreenShot_D {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = driver;
		
//		Capture full page screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Maven\\ScreenShot\\full.png");	
		Files.copy(src, trg);

//		Capture screenshot for specific area -- selenium4
//		WebElement featureproduct = driver.findElement(By.xpath("//img[@title='Show details for Apple MacBook Pro 13-inch']"));
//		File src = featureproduct.getScreenshotAs(OutputType.FILE);
//		File trg = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Maven\\ScreenShot\\full.png");	
//		Files.copy(src, trg);
//		System.out.println("Screenshot taken");
	}

}
