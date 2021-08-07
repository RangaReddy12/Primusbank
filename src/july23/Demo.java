package july23;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Demo {
	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("E://Sample.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheetAt(0);
		int rowcount =ws.getLastRowNum();
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
		String username =ws.getRow(i).getCell(0).getStringCellValue();
		if(wb.getSheet("Login").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			//get integer type cell
			int celldata =(int)wb.getSheet("Login").getRow(i).getCell(1).getNumericCellValue();
			//convert integer type into string type
			String password =String.valueOf(celldata);
			System.out.println(username+"   "+password);
		}
		fi.close();
		wb.close();
		}

	}

}
