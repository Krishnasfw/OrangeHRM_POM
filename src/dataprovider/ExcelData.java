package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
static Workbook workbook ;
static Sheet sheet;
	public static Object[][] getdata(String sheetname) {
		
		String path = "C:\\Users\\Admin\\Desktop\\Testing Data\\OrangeTestData1.xlsx";
		
		FileInputStream file = null;
		try {
			file = new FileInputStream(path); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			workbook = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = workbook.getSheet(sheetname);
		System.out.println(sheetname);
		
			int rowcount = sheet.getLastRowNum() ;
			int colcount = sheet.getRow(0).getLastCellNum();
			Object[][] data = new Object[rowcount][colcount];
			for (int i = 0; i<rowcount; i++) {
				for (int j = 0; j < colcount; j++) {
					DataFormatter dataformatter = new DataFormatter();
					data[i][j] = dataformatter.formatCellValue(sheet.getRow(i + 1).getCell(j));
		}

	}
			return data;
			
		} 
		
}
