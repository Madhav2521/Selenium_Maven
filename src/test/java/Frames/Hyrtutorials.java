package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyrtutorials {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Madhav Jain");
		Thread.sleep(3000);
//		Approach 1	Using ID/Name
//		driver.switchTo().frame("frm1");

//		Approach 2 WebELement
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"frm1\"]")); 
		driver.switchTo().frame(frame1);
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"selectnav1\"]"));				
		Select select_dropwdown = new Select(dropdown);
		select_dropwdown.selectByVisibleText("- Java");
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//*[@id=\"frm2\"]")); 
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("fName")).sendKeys("Madhav");
		driver.findElement(By.name("lName")).sendKeys("Jain");
		driver.findElement(By.id("malerb")).click();
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		driver.findElement(By.xpath("//input[@id='hindichbx']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("madhavjain2501@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123abc");
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//*[@id=\"frm3\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("MJ");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"selectnav2\"]")).click();
		//	driver.close();
	}

}
