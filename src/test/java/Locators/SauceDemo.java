package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SauceDemo {
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		if(browser.equals("Chrome")) 
			driver = new ChromeDriver();
		else if(browser.equals("Firefox")) 
			driver = new FirefoxDriver();
		else  
			driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement passwordfield = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwordfield.sendKeys("secret_sauce");
		WebElement usernamefield = driver.findElement(RelativeLocator.with(By.tagName("input")).above(passwordfield));
		usernamefield.sendKeys("problem_user");
		WebElement button = driver.findElement(RelativeLocator.with(By.tagName("input")).below(passwordfield));
		button.click();
		Thread.sleep(300);
		driver.close();
	}
}