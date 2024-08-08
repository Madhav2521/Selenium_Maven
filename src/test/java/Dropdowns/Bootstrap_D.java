package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_D {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		driver.findElement(By.xpath("//input[@value = 'Java']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[3]/div/span/div/ul/li"));
		System.out.println(elements.size());
		for(WebElement i : elements) {
			System.out.println(i.getText());
		}
		driver.close();
	}

}
