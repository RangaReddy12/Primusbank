package july22;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable{
		//Read path of excel file
		FileInputStream fi = new FileInputStream("D://Sample.xls");
		//get work book
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws = wb.getSheetAt(0);
		//count no of rows in a sheet
		int rowcount =ws.getLastRowNum();
		System.out.println("No of rows are::"+rowcount);
		//iterate all rows
		for(int i=1;i<=rowcount;i++)
		{
			//read username and password cells
			String username = ws.getRow(i).getCell(0).getStringCellValue();
			String password = ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"   "+password);
			//write some text into results cell
			ws.getRow(i).createCell(2).setCellValue("iam learing java");
		}
		//closefi file
		fi.close();
		//write into new File
		FileOutputStream fo = new FileOutputStream("E://Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();

	}

}
