package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
//		isDisplayed()
		Boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("The logo is displayed: " + logo);
		
//		isEnabled()
		Boolean textfield = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("The textfield is enabled: " + textfield);
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
				
		System.out.println("Before select: ");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());

		male.click();
				
		System.out.println("After select: ");
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		driver.close();
	}

}
