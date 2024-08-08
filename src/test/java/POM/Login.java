//PAGE OBJECT MODEL
package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;	// global

//	constructor
	Login(WebDriver driver){
		this.driver = driver;
	}

//	locate elementts
	By logo = By.cssSelector(".orangehrm-login-branding\n");
	By username = By.name("username");
	By password = By.name("password");
	By loginbutton = By.xpath("//button[normalize-space()='Login']");
	
//	actions -- methods 
	public void setUserName(String user_name) {
		driver.findElement(username).sendKeys(user_name);
	}
	
	public void setPassword(String pass_word) {
		driver.findElement(password).sendKeys(pass_word);
	}
	
	public void clickLogin() {
		driver.findElement(loginbutton).click();
	}
	
	public boolean checkLogo() {
		boolean status = driver.findElement(logo).isDisplayed();
		return status;
	}
}
