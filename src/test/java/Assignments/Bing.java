package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sa_5005\"]/div[2]")).click();
	}
}
