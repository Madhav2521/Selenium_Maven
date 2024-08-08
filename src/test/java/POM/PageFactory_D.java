package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_D {
	WebDriver driver;
	
	PageFactory_D(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		//use for creating POM classes; here we don't use .findElement
	}
	
	@FindBy(css = ".orangehrm-login-branding\n")
	WebElement logo;
	
	@FindBy(name= "username")
	WebElement username;
	
//	@FindBy(how=How.NAME, using ="username")
//	WebElement username;

	@FindBy(name= "password")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbutton;
	
	public void setUserName(String user_name) {
		username.sendKeys(user_name);
	}
	
	public void setPassword(String pass_word) {
		password.sendKeys(pass_word);
	}
	
	public void clickLogin() {
		loginbutton.click();
	}
	
	public boolean checkLogo() {
		boolean status = logo.isDisplayed();
		return status;
	}

}
