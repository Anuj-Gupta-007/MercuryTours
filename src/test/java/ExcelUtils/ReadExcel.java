package ExcelUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main() throws IOException {

		FileInputStream fis = new FileInputStream("C:/Users/Sudhir Kumar/eclipse-workspace/MercuryTours/excel/Testdata.xlsx");

		XSSFWorkbook Workbook = new XSSFWorkbook(fis);
		XSSFSheet sh = Workbook.getSheetAt(0);
		Row rw = sh.getRow(1);
		Cell cl = rw.getCell(0);
		String value = cl.getStringCellValue();
		System.out.println(value);
	}

}
