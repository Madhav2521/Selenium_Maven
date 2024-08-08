package DatePickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_D {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		
//		Approach 1
//		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("07/25/2001");

//		Approach 2
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(3000);
		String year = "2024";
		String month = "July";
		String date = "25";
		
		while(true) {
			String yr = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			String mon = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			if(year.equals(yr) && month.equals(mon)) 
				break;
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement dat: alldates) {
			if(dat.getText().equals(date)) {
				dat.click();
				break;
			}
		}
//		for(int i = 0; i<alldates.size(); i++) {
//			if(alldates.get(i).getText().equals(date)) {
//				alldates.get(i).click();
//				break;
//			}
//		}
//		driver.close();
	}

}
