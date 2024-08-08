package JavaSciptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithElementJS {

	public static void main(String[] args) {
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		JavaScriptExecutor js = driver;
		
//		Input Box
		WebElement inputbox = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('value', 'Madhav')", inputbox);
		
//		Radio Button
		WebElement male_rd = driver.findElement(By.id("male"));
		js.executeScript("arguments[0].click();" , male_rd);
	}

}
