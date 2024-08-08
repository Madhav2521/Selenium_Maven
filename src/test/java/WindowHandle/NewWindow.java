package WindowHandle;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev/");
	}

}
