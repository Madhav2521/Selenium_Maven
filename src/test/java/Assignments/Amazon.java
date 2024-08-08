package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        WebElement link = driver.findElement(By.linkText("Click me"));
        link.click();
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("newpage")) {
        	System.out.println("URL verification successful. The URL contains 'newpage'.");
        } else {
        	System.out.println("URL verification failed. The URL does not contain 'newpage'.");
        }
        driver.quit();
    }
}
