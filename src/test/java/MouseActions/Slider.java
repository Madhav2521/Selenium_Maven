package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement e1 = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Location of element before slider: " + e1.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(e1, 100, 0).perform();
		System.out.println("Location of element after slider: " + e1.getLocation());
		driver.close();
	}
	
}