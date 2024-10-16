package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import java.io.FileInputStream;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadXlRead {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	
	
	public void getdata(String excelSheetname) throws EncryptedDocumentException, IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Testdata\\Testdata.xlsx");
		FileInputStream fls =new  FileInputStream(f);
		
		//Workbook wb = WorkbookFactory.create(fls);
		
		ExcelWBook = new XSSFWorkbook(fls);
		
        ExcelWSheet = ExcelWBook.getSheet(excelSheetname); 
		
		
		
	}
	
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) throws Exception{
	       try{
	          Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	          String CellData = Cell.getStringCellValue();
	          return CellData;
	          
	          }catch (Exception e)
	       {
	        	  
	        	  System.out.println("worksheet error"+e);
	            return"";
	          }
	}
}
