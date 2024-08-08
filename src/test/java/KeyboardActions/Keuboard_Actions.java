package KeyboardActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

public class Keuboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement button = driver.findElement(By.xpath("//a[@class='ico-register']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(button).keyUp(Keys.CONTROL).perform();
		Set windowIDs = driver.getWindowHandles();
		List<String> IDs = new ArrayList(windowIDs);
		String parent = IDs.get(0);
		String child = IDs.get(1);
		driver.switchTo().window(child);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='gender-male']")).click();
		driver.switchTo().window(parent);
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		if(logo.isDisplayed())
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		driver.quit();
	}

}
