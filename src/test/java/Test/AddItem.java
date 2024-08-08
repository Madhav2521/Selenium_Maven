package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItem {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")).click();
		driver.findElement(By.xpath("//img[@title='Show products in category Desktops']")).click();
		driver.findElement(By.xpath("//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]")).click();
		Thread.sleep(3000);
		WebElement shoppingcart = driver.findElement(By.xpath("//span[@class='cart-qty']"));
		String con=	shoppingcart.getText();
		if(con.contains("1")) 
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		driver.close();
		
	}
	
}
