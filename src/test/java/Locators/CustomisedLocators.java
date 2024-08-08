package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomisedLocators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
//		Tag and ID
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");

//		Tag and Class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
//		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
//		Tag and Attribute
//		driver.findElement(By.cssSelector("input[name='q]")).sendKeys("MacBook");
	
//		Tag, Class and Attribute
		driver.findElement(By.cssSelector("input.search-box-text[id='small-searchterms']")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("button.button-1")).click();
		driver.close();
	}

}
