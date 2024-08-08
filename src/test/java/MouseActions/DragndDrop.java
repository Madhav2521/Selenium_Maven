package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement Rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement Italy = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Rome, Italy).perform();
		WebElement Washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement UnitedStates = driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(Washington, UnitedStates).perform();
		driver.close();
	}

}
