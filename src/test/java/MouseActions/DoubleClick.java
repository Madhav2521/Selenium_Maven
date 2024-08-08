package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(frame);
		WebElement field1=  driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Madhav");
		Actions actfield = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		actfield.doubleClick(button).perform();
		WebElement field2=  driver.findElement(By.xpath("//input[@id='field2']"));
		System.out.println(field2.getAttribute("value"));
		driver.close();
	}

}
