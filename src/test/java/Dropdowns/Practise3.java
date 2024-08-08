package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		WebElement country = driver.findElement(By.xpath("//select[@id='country-list']"));
		country.click();
		Select select_country = new Select(country);
		select_country.selectByVisibleText("India");
		WebElement choosen_country = select_country.getFirstSelectedOption();
		System.out.println(choosen_country.getText());
		WebElement state = driver.findElement(By.xpath("//select[@id='state-list']"));
		state.click();
		Thread.sleep(3000);
		Select select_state = new Select(state);
		select_state.selectByVisibleText("Haryana");
		WebElement choosen_state = select_state.getFirstSelectedOption();
		System.out.println(choosen_state.getText());
		driver.close();
	}
}
