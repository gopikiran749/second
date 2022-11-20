package xlDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.rowset.internal.Row;



public class xltest {

	
	public static void main(String[] args) throws IOException {
	
		FileInputStream f1 = new FileInputStream("c:\\MyTest\\TestData.xlsx");
		Workbook wb = new XSSFWorkbook(f1);
		Sheet sh = wb.getSheet("Login");
		org.apache.poi.ss.usermodel.Row r= sh.getRow(1);
		Cell c1= r.getCell(0);
		Cell c2= r.getCell(1); 
		System.out.println(c1+ " " + c2);
		 
		
	}

}
