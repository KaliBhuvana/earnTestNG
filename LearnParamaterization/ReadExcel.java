package LearnParamaterization;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static String[][] readData(String fileName) throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook("./Data/"+fileName+".xlsx");
	XSSFSheet sheet = wb.getSheet("Sheet1");
	
	int RowCount = sheet.getLastRowNum();
	
	int cellCount = sheet.getRow(0).getLastCellNum();
	
	String[][] d=new String[RowCount][cellCount];
	for (int i = 1; i < RowCount; i++) {
		
		for (int j = 0; j < cellCount; j++) {
			
			String data = sheet.getRow(i).getCell(j).getStringCellValue();
			d[i-1][j]=data;
			System.out.println(data); 
			
		}
		/*XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.getCell(0);
		
		String text = cell.getStringCellValue();
		System.out.println(text);*/
	}
	
	
	wb.close();
	return d;
}
}