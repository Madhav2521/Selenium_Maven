package WindowHandle;

import java.util.*;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_D {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
//		Set WindowIDS = driver.getWindowHandles();
//		List<String> al = new ArrayList(WindowIDS);
//		String parentwindowID = al.get(0);
//		String childwindowID = al.get(1);
//		driver.switchTo().window(childwindowID);
//		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(parentwindowID);
//		if("OrangeHRM".equals(driver.getTitle()))
//				driver.close();
//		else {
//			driver.switchTo().window(childwindowID);
//			driver.close();
//		}
//		driver.quit();
	}

}
