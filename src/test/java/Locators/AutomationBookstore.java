// Relative Locators

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AutomationBookstore {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://automationbookstore.dev/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"pid3\"]"));
		System.out.println("Self Node: " + element.getText());

		WebElement belowElement = driver.findElement(RelativeLocator.with(By.tagName("li")).below(element));
		System.out.println("Book below Self Node: " + belowElement.getText());
		
		WebElement LeftElement = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(element));
		System.out.println("Book to the Left of Self Node: " + LeftElement.getText());
		
		WebElement RightElement = driver.findElement(RelativeLocator.with(By.tagName("li")).toRightOf(element));
		System.out.println("Book to the Right of Self Node: " + RightElement.getText());
		
		WebElement NearElement = driver.findElement(RelativeLocator.with(By.tagName("li")).near(element));
		System.out.println("Book Near to the Self Node: " + NearElement.getText());
		driver.close();
	}

}
