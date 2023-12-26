package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	static XSSFWorkbook workbook;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowcount();
		getCellValue(1,0);
		getCellValue(1,1);
		
	}
		
		public static int getRowcount()
		{
			String path=System.getProperty("user.dir");
			try {
				 workbook = new XSSFWorkbook(path+"/Excel/inputData.xlsx");
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rcnt=sheet.getPhysicalNumberOfRows();
		return rcnt;
			}
		public static String getCellValue(int rno,int cno)
		{
			String path=System.getProperty("user.dir");
			try {
				 workbook = new XSSFWorkbook(path+"/Excel/inputData.xlsx");
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		XSSFSheet sheet=workbook.getSheet("sheet1");
		String uname=sheet.getRow(rno).getCell(cno).getStringCellValue();
		return uname;
		
	
	
			}

	}

		

