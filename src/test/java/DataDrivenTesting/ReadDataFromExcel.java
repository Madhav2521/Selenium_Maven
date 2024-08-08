package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		//Reading Data -- FileInputStream
		//Excel file-->Workbook-->Sheets-->Rows-->Columns
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Book1.xlsx");
//		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Maven\\TestData\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);		//apache poi
		XSSFSheet sheet = workbook.getSheet("Sheet1");		// name of the sheet
//		XSSFSheet sheet = workbook.getSheetAt(0); 			// index
		int rows = sheet.getLastRowNum();					// row no
		int cols = sheet.getRow(1).getLastCellNum();		// col no 
		System.out.println("The no of rows are: " + rows);
		System.out.println("The no of cols are: " + cols);
		for(int r = 0; r<=rows; r++) {		// rows
			XSSFRow currentRow = sheet.getRow(r);		//0,1,2,3,4,5
			for(int c = 0; c<cols; c++) {				//0,1,2,3
//				XSSFCell cellValue = currenRow.getCell(c);
//				String cell = cellValue.toString();

				String cellValue = currentRow.getCell(c).toString();
				System.out.println(cellValue + " ");
			}
			System.out.println();    	//formatting
		}
		workbook.close();
		file.close();
	}
}
