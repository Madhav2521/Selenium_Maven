package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBar {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirt");
		driver.findElement(By.name("submit_search")).click();
//		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		driver.findElement(By.partialLinkText("Faded Short")).click();
				
	}
}
