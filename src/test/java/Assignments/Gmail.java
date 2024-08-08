package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Gmail {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
            // Open Gmail login page
            driver.get("https://mail.google.com/");

            // Locate and enter the username
            WebElement usernameField = driver.findElement(By.id("identifierId"));
            usernameField.sendKeys("your-email@gmail.com");

            // Click the 'Next' button
            WebElement nextButton = driver.findElement(By.id("identifierNext"));
            nextButton.click();

            // Wait for the password field to be visible and enter the password
            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("your-password");

            // Click the 'Next' button
            WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
            passwordNextButton.click();

            // Wait for the inbox page or an element unique to the logged-in state
            WebElement inboxElement = driver.findElement(By.xpath("//a[contains(@title, 'Inbox')]"));

            // Verify that the login is successful
            if (inboxElement.isDisplayed()) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login failed.");
            }
    }
}
