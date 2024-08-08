package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Parameterizaion_D {
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeClass
	void setup() {
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	}
	  
	@Test (priority = 1)
	void testURL () {
		String link = driver.getCurrentUrl();
		Assert.assertEquals(link, "https://demo.nopcommerce.com/login?returnUrl=%2F", "Both must be equal");
	}
	  
	
	@Test (priority = 2, dataProvider = "dp")
	void Login(String email, String password ) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("email");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "nopCommerce demo store", "Both the titles should be equal");
	}
	
	@DataProvider (name = "dp")
	String[][] LoginData () {
//		String data[][] = {{"ish0345678@gmail.com", "Pass1234"}, {"joy@yopmail.com", "Joy@2507"}, {"madhavjain2501@gmail.com", "123@"}};
		 String data [][] = {{"rishupatel002@gmail.com","123456"},
	  				{"raman123@gmail.com","1234"},
	  				{"nitika1995@gmail.com","abcds"},
	  				{"priya1997@gmail.com","abcds"}};		
		 return data;
 	}
	
	@AfterClass
	void teardown() {
		driver.close();  
	}
}
