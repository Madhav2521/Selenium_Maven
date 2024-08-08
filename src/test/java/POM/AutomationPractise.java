package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPractise {
	WebDriver driver;
	
	AutomationPractise(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.id("email");
	By password = By.id("passwd");
	By signin = By.xpath("//span[normalize-space()='Sign in']");
	By logo = By.cssSelector("img[alt='My Shop']");

	public void setEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}
	
	public void setPassword(String pass_word) {
		driver.findElement(password).sendKeys(pass_word);
	}
	
	public void click() {
		driver.findElement(signin).click();
	}
	
	public boolean checkLogo() {
		boolean status = driver.findElement(logo).isDisplayed();
		return status;
	}
}
