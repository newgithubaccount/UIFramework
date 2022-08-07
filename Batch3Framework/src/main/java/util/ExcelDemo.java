package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void updateDaqta(String ip, String db, String pn, String cd) throws IOException {
		String xlsxFile = "./NSS-FDA ValueTesting withCalcs and Data_AutoVerPOC.xlsm";
		FileInputStream fis = new FileInputStream(
				new File("./NSS-FDA ValueTesting withCalcs and Data_AutoVerPOC.xlsm"));
		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		// creating a Sheet object to retrieve the object
		XSSFSheet sheet = wb.getSheet("Start");
		FileOutputStream os = null;
		Cell cell = null;
		for (int i = 7; i <= 11; ++i) {
			Row row = sheet.getRow(i);
			cell = row.createCell(4);
			switch (i) {
			case 7:
				cell.setCellValue(ip);
				break;
			case 8:
				cell.setCellValue(db);
				break;
			case 9:
				cell.setCellValue(pn);
				break;
			case 10:
				cell.setCellValue(cd);
				break;
			}

			fis.close();
			os = new FileOutputStream(xlsxFile);
			wb.write(os);

			// Close the workbook and output stream

		}
		wb.close();
		os.close();
		// evaluating cell type
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelDemo.updateDaqta("10.43.0.132", "nss_qa", "fda_nss", "15-10-2020");
	}

}
