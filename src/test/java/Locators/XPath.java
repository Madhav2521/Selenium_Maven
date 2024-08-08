package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://developer.salesforce.com/signup");
		
		driver.close();
	}
}
