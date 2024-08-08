package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Methods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));	//		Implicit Wait

//		Explicit wait
	    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));	// Declaration
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));		
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));		
		driver.findElement(By.name("password")).sendKeys("admin123");				
		
//		Fluent Wait
//		Declaration
//		FluentWait mywait =new FluentWait<>(driver);
//		mywait.withTimeout(Duration.ofSeconds(30));
//		mywait.pollingEvery(Duration.ofSeconds(5));
//		mywait.ignoring(ElementNotInteractableException.class);
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	    mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));		
//	    driver.findElement(By.name("username")).sendKeys("Admin");
//	    mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));		
//		driver.findElement(By.name("password")).sendKeys("admin123");				

		driver.close();
	}

}
