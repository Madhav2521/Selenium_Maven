package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_D {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Today is my bday!!!");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		driver.close();
	}

}
