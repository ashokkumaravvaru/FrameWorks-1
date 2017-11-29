package com.rameshsoft.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelReader {
	static String filePath;
	File f;
	FileInputStream fip;
	Workbook wb;
	Sheet sh;
	Row rw;
	Cell cl;
	
	public ExcelReader(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		this.filePath=filePath;
		f=new File(filePath);
		fip = new FileInputStream(f);
		wb =WorkbookFactory.create(fip);
		
	}
	
	public Sheet getSheet(String sheetName)
	{
		 sh =wb.getSheet(sheetName);
		return sh;
	}
	
	public Row getRow(String sheetName,int rowNum)
	{
		 sh=getSheet(sheetName);
		 rw=sh.getRow(rowNum);
		return rw;
	}
	
	public Cell getCell(String sheetName,int rowNum,int cellNum)
	{
		 rw=getRow(sheetName,rowNum);
		 cl=rw.getCell(cellNum);
		return cl;
	}
	
	public String getCellValue(String sheetName,int rowNum,int cellNum)
	{
		String value=null;
		cl=getCell(sheetName,rowNum,cellNum);
		if(cl.getCellType()==cl.CELL_TYPE_STRING)
		{
			value= cl.getStringCellValue();
		}
		else if (cl.getCellType()==cl.CELL_TYPE_NUMERIC) {
			value = cl.getNumericCellValue()+"";
		}
		return value;
	}
	
	/*public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File f=new File(filePath);
		FileInputStream fip = new FileInputStream(f);
		Workbook wb =WorkbookFactory.create(fip);
		Sheet sh=wb.getSheetAt(0);
		int rowcount=sh.getLastRowNum();
		Row rw =sh.getRow(0);
		int cellCount=rw.getLastCellNum();
		
		Cell cl=rw.getCell(0);
		String value=cl.getStringCellValue();*/
	}

