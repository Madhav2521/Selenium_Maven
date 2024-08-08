//1) Find total number of rows
//2) Find total number of columns
//3) Read specific row & column data
//4) Read data from all the rows & columns
//5) Print book names whose author is Amit
//6) Find sum of prices for all the books

package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

//		Find the table element
		WebElement table = driver.findElement(By.name("BookTable"));

//		Find all rows in the table (excluding header row)
		List<WebElement> rows = table.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total number of rows are: " + rowCount);
		
//		Find all columns in the table
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr/th"));
		int colCount = columns.size();
		System.out.println("Total number of columns are: " + colCount);
		System.out.println();

// 		Read specific row and column data (e.g., 3rd row, 3rd column)
		WebElement data = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[4]/td[3]"));
		System.out.println(data.getText());
		System.out.println();
		
//		Read data from all the rows & columns
		System.out.println(table.getText());
		System.out.println();
		
//		Print book names whose author is Amit
		WebElement author = driver.findElement(By.xpath("//tr/td[2]"));
		WebElement BookName = driver.findElement(By.xpath("//tr/td[1]"));
		for(WebElement row: rows) {
			if(author.equals("Amit")) {
				continue;
			}
		}
		System.out.println(BookName.getText());
		System.out.println();
		
//		Find sum of prices for all the books
		int sum = 0;
		WebElement price = driver.findElement(By.xpath("//tr/td[4]"));
		for(WebElement row: rows) {
			
			
		}
		
		driver.close();
	}

}
