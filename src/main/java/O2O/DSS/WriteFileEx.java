package O2O.DSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFileEx {
	 void Write () throws IOException {

		File sc = new File("C:\\Users\\USER\\eclipse-workspace\\Book1.xlsx");
		FileInputStream fix = new FileInputStream(sc); // file
		XSSFWorkbook wb = new XSSFWorkbook(fix); // file
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(1).setCellValue("Yến mely");
		FileOutputStream out = new FileOutputStream(sc);
		wb.write(out);
		wb.close();

	}
}
