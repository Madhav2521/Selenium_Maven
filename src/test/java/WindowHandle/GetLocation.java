package WindowHandle;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("By defualt location of logo is: " + logo.getLocation());
		driver.manage().window().minimize();
		System.out.println("Location of logo in minimize is: " + logo.getLocation());		
		driver.manage().window().maximize();
		System.out.println("Location of logo in maximize is: " + logo.getLocation());
		Point pointdim = new Point(84,35);
		driver.manage().window().setPosition(pointdim);
		System.out.println("The value of element after setting the position of logo is: " + logo.getLocation());
		driver.close();
	}

}
