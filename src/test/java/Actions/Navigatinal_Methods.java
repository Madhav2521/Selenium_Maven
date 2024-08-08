package Actions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatinal_Methods {
	public static void main(String[] args) throws MalformedURLException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.udemy.com/");
		URL url = new URL("https://www.amazon.in/");
		driver.navigate().to(url);
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}