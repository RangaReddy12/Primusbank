package july22;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsinginterfaceHiherversion {

	public static void main(String[] args)throws Throwable {
		// Read path of excel file
				FileInputStream fi = new FileInputStream("E://Sample.xlsx");
				//get wb from file
				Workbook wb = WorkbookFactory.create(fi);
				//get sheet from wb
				Sheet ws = wb.getSheetAt(0);
				//get row from sheet
				Row row = ws.getRow(0);
				//count rows
				int rowcount =ws.getLastRowNum();
				//count cell
				int cellcount =row.getLastCellNum();
				System.out.println("No of rows are::"+rowcount+"   "+"No of cells are::"+cellcount);
				for(int i=1;i<=rowcount;i++)
				{
					String username = ws.getRow(i).getCell(0).getStringCellValue();
					String password = ws.getRow(i).getCell(1).getStringCellValue();
					System.out.println(username+"   "+password);
					//write some text into results cell
					ws.getRow(i).createCell(2).setCellValue("pass");
				}
		        fi.close();
		        FileOutputStream fo = new FileOutputStream("E://Results.xlsx");
		        wb.write(fo);
		        fo.close();
		        wb.close();
			}

	}


