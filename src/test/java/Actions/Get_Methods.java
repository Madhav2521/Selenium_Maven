package Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
//		driver.get() method navigates to particular web page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		driver.getTitle() method gives the title of current page
		System.out.println(driver.getTitle());
		
//		driver.getCurrentUrl() return the current page url
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		driver.getPageSource() return the HTML code of the current page
//		System.out.println(driver.getPageSource());
		
//		driver.getWindowHandle() return one window ID for current page
		System.out.println(driver.getWindowHandle());
		
//		driver.getWindowHandles()
		Set<String> windowIDs = driver.getWindowHandles();
		List IDs = new ArrayList(windowIDs);
		System.out.println(IDs);
		driver.quit();
	}

}
