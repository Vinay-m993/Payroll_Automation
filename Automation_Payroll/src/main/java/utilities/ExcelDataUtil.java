
package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataUtil extends Base {

	@DataProvider
	public static Object[][] readExcel(String FilePath, String SheetName) throws IOException, BiffException {

		FileInputStream ExcelFile = new FileInputStream(FilePath);
		Workbook w = Workbook.getWorkbook(ExcelFile);
		Sheet s = w.getSheet(SheetName);

		int startRow = s.getRows();
		int startCol = s.getColumns();

		System.out.println("Row= " + "" + startRow + "Coloumn= " + startCol);

		String[][] input = new String[startRow][startCol];
		for (int i = 0; i < startRow; i++) {

			for (int j = 0; j < startCol; j++) {

				Cell c = s.getCell(j, i);
				input[i][j] = c.getContents();

			}
		}
		return input;
	}

}
