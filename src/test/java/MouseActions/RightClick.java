package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightButtton = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		Actions actbutton = new Actions(driver);
		actbutton.contextClick(rightButtton).perform();		//		Right Click
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
	}

}
