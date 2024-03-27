package com.ect.utilities;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	public static FileInputStream fis;
	public static XSSFWorkbook workBook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static String getCellvalue(String fileName,String sheetname,int row,int colNo)
	{
		try {
			fis=new FileInputStream(fileName);
			workBook= new XSSFWorkbook(fis);
			excelSheet= workBook.getSheet(sheetname);
			cell=excelSheet.getRow(row).getCell(colNo);
			
			workBook.close();
			
			return cell.getStringCellValue();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			return " ";
		}
	}
		
		public static int getRowCount(String fileName,String sheetName)
		{
			try {
				fis=new FileInputStream(fileName);
				workBook= new XSSFWorkbook(fis);
				excelSheet= workBook.getSheet(sheetName);
				
				int row=excelSheet.getLastRowNum()+1;
				
				workBook.close();
				
				return  row;
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				return 0;
			}
		}
	
		public static int getColCount(String fileName,String sheetName)
		{
			try {
				fis=new FileInputStream(fileName);
				workBook= new XSSFWorkbook(fis);
				excelSheet= workBook.getSheet(sheetName);
				
				int col=excelSheet.getRow(0).getLastCellNum();
				
				workBook.close();
				
				return  col;
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				return 0;
			}
		}
		
		public String getStringData(int sheetIndex,int row,int column)
		{
			return workBook.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		}
		
		public String getStringData(String sheetName,int row,int column)
		{
			return workBook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		}
		
		public double getNumericData(String sheetName,int row,int column)
		{
			return workBook.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
		}

	

}
