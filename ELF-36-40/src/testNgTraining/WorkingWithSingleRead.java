package testNgTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithSingleRead {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// to create a new file
		File file=new File("./testData/TestData.xlsx");
		
		//to input the file to perform operation
		FileInputStream fis =new FileInputStream(file);
		
		//create workbook
		Workbook workbook=WorkbookFactory.create(fis);
		
		Sheet sheet=workbook.getSheet("Login");
		Row row=sheet.getRow(0);
		
		Cell cell= row.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		
	}

}
