//How many total no of sliders on the page.
//Find the total no of images available on the page.
//Find the total no of links available on the page.

package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassAndTagLocators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		List<WebElement> slider = driver.findElements(By.className("homeslider-container"));
		System.out.println("The total number of sliders are: " + slider.size());
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("The total number of images are: " + images.size());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links are: " + links.size());
		driver.close();
//		driver.get("https://www.udemy.com/");
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		driver.findElements(By.className(""));
	}

}
