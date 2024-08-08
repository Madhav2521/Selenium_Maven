package POM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
//	Login lp;
	PageFactory_D pf;
	WebDriver driver;
	
	@BeforeClass
	void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	void TestLogin() {
		pf.setUserName("Admin");
		pf.setPassword("admin123");
		pf.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority = 1) 
	void CheckLogo() {
		pf = new PageFactory_D(driver);
		Assert.assertEquals(pf.checkLogo(), true);
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}	
}
