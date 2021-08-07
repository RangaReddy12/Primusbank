package july22;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readdata {
	public static void main(String[] args)throws Throwable {
		// Read path of excel file
		FileInputStream fi = new FileInputStream("e://Sample.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheet("Login");
		//get first row from sheet
		XSSFRow row =ws.getRow(0);
		//count no of rows in a sheet
		int rowcount =ws.getLastRowNum();
		//count no of cells in first row
		int cellcount = row.getLastCellNum();
		System.out.println("No of rows are::"+rowcount+"  "+"No of cells in first row::"+cellcount);
		//print second row first cell data
		String username =ws.getRow(2).getCell(0).getStringCellValue();
		//print second row second cell data	
		String password =ws.getRow(2).getCell(1).getStringCellValue();
		System.out.println(username+"   "+password);
		//close file
		fi.close();
		wb.close();

	}

}
