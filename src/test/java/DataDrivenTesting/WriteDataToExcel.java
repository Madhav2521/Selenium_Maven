package DataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\Book2.xlsx");
//		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Maven\\TestData\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();		//apache poi
		
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
//		without for loop
//		XSSFRow row1 = sheet.createRow(0);
//		
//		row1.createCell(0).setCellValue("Welcome");
//		row1.createCell(1).setCellValue("1234");
//		row1.createCell(2).setCellValue("Automation");
//		
//		XSSFRow row2 = sheet.createRow(1);
//		row1.createCell(0).setCellValue("John");
//		row1.createCell(1).setCellValue("Core");
//		row1.createCell(2).setCellValue("Java");
		
//		with for loop
		Scanner sc = new Scanner(System.in);
		for(int r = 0; r<3; r++) {
			XSSFRow currentRow = sheet.createRow(r);
			for(int c = 0; c<2; c++) {
//				currentRow.createCell(c).setCellValue("Welcome");   // same data in every cell
				System.out.println("Enter the value of cell");
				String data = sc.next();
				currentRow.createCell(c).setCellValue(data);
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is closed");
	}

}
