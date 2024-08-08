package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationPractise_Test {
	WebDriver driver;
	AutomationPractise ap;
	
	@BeforeClass
	void setBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=identity");
	}

	
	@Test (priority = 2)
	void checkRegistered() throws InterruptedException {
		ap.setEmail("test@yopmail.com");
		ap.setPassword("XrkXc3TK");
		ap.click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Identity - My Shop");
	}
	
	@Test (priority = 1)
	void checkLogo() {
		ap = new AutomationPractise(driver);
		Assert.assertEquals(ap.checkLogo(), true);
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
}
