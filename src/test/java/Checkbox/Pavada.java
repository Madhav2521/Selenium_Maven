package Checkbox;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pavada {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		// Maximizes the Window
		driver.manage().window().maximize();
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Selected ");
		//    First 3 elements 
	    for (int i=0; i<3;i++) {
	    	checkbox.get(i).click();
	    }
	    for (WebElement i:checkbox ) {
	    	System.out.println(i.isSelected());
	    }
	    System.out.println("Unselected");
	    for (int i=0;i<checkbox.size();i++) {
	    	if (checkbox.get(i).isSelected()) {
	    		checkbox.get(i).click();
	    	}
	    }   
	    for (WebElement i:checkbox ) {
	    	System.out.println(i.isSelected());
	    }
		       driver.close();


//	       for (int i=0; i<3;i++)
//	       {
//	    	   checkbox.get(i).click();
//	       }
	       // USING IF CONDITION 
	        
	}

}