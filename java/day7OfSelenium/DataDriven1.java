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

public class DataDriven1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//login functions---->user name , password, invalid credentials
		//admin1 pass1
		//admin2 pass2
		//admin3 pass3
		//....
		//step 1-> file location
		File file=new File("./excelFiles/book12.xlsx");
		
		//step 2-> create connection with the file
		FileInputStream fis=new FileInputStream(file);
		
		//step 3-> type of file
		Workbook wb=WorkbookFactory.create(fis);
		
		//step 4-> getting the sheet
		Sheet sheet=wb.getSheetAt(0);
		
		//step 5-> get the row from the sheet
		Row row=sheet.getRow(0);
		
		//step 6-> get the cell from row
		Cell cell=row.getCell(0);
		Cell cell2=row.getCell(1);
		
		//step 7-> print the cell
		String user=cell.toString();
		System.out.println(user);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
