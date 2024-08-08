// XPath axis

package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
//		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"email\"]//preceding::*"));
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"email\"]//following::*"));
		System.out.println(elements.size());
		for(WebElement name: elements)
			System.out.println(name.getText());
		driver.close();
		
	}
}
