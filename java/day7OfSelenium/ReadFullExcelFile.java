package day7OfSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFullExcelFile {
	public static void test1(String u, String p) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		user.sendKeys(u);
		pass.sendKeys(p);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1-> file location
		File file = new File("./excelFiles/book12.xlsx");

		// step 2-> create connection with the file
		FileInputStream fis = new FileInputStream(file);

		// step 3-> type of file
		Workbook wb = WorkbookFactory.create(fis);

		// step 4-> getting the sheet
		Sheet sheet = wb.getSheetAt(0);

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);
				String u = cell.toString();
				j++;
				Cell cell2 = row.getCell(j);
				String p = cell.toString();
				test1(u, p);

			}
			System.out.println();
		}
	}
}
// successful of data driven with the concept of read the excel file and data
// driven
