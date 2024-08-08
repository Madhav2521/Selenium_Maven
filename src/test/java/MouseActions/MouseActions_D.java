package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_D {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	//		Implicit Wait
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement Computers = driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
		WebElement Desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));		
		Actions actiondes = new Actions(driver);
		Thread.sleep(3000);

//		movetoElement method 1
		actiondes.moveToElement(Computers).moveToElement(Desktop).click().build().perform();
//		actiondes.moveToElement(Computers).moveToElement(Desktop).click().perform();
//		actiondes.moveToElement(Computers).moveToElement(Desktop).click();
		
		driver.close();
	}

}
