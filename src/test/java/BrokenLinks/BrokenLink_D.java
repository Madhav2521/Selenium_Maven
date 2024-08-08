//	Status CODE is 200 or above then the request is executed
//	Status CODE is 400 or above then the link is broken

package BrokenLinks;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class BrokenLink_D {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("The total number of links are: " + links.size());
		int brokenlinks = 0;
		
//		If href value is empty or not
		for(WebElement linkElement: links) {
			String hrefvalue = linkElement.getAttribute("href");	// Value of href attribute
			if(hrefvalue==null || hrefvalue.isEmpty()) {
				System.out.println("href value is empty");
				continue;
			}
			
//			connection--open,send
			URL linkurl = new URL(hrefvalue);
			HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();
			conn.connect();
			if(conn.getResponseCode()>400) {
				System.out.println(hrefvalue + " " + "Broken Link");
				brokenlinks++;
			}
			else {
				System.out.println(hrefvalue + " " + "NOT Broken Link");
			}
		}
		System.out.println("Total number of Broken links are: " + brokenlinks);
		driver.close();
	}
}
