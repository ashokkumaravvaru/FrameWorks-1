package com.ramesh.Pojo;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.utilites.ExcelReader;
import com.rameshsoft.utilites.PropertiesReusabilites;
import com.rameshsoft.utilites.TextFilesUtilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


public class GmailPojo 
{
	private static String configFile="C:\\Users\\Ashok\\Desktop\\class\\RAMESH_FRAMEWORK_POM\\src\\com\\rameshsoft\\configuration\\config.properties";
	private static String browserUtilFile="D:\\pb2\\sampleframework\\browserutil.properties";
	private static String orFile="D:\\pb2\\sampleframework\\src\\com\\rameshsoft\\automation\\objectrepository\\or_GMAIL.properties";
	private static String excelFile="C:\\Users\\Ashok\\Desktop\\class\\RAMESH_FRAMEWORK_POM\\src\\com\\rameshsoft\\testdata\\testdata.xlsx";
	private static String textFile="D:\\pb2\\sampleframework\\src\\com\\rameshsoft\\automation\\envappdata\\gmail.txt";
	
	static public PropertiesReusabilites getConfigFile() throws IOException
	{
		PropertiesReusabilites pf = new PropertiesReusabilites(configFile);
		return pf;
	}
	
	static public PropertiesReusabilites getBrowserUtilFile() throws IOException
	{
		PropertiesReusabilites pf = new PropertiesReusabilites(browserUtilFile);
		return pf;
	}
	
	static public PropertiesReusabilites getOrFile() throws IOException
	{
		PropertiesReusabilites pf = new PropertiesReusabilites(orFile);
		return pf;
	}
	
	static public ExcelReader getExcelReader() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException
	{
		ExcelReader er = new ExcelReader(excelFile);
		return er;
	}
	
	static public TextFilesUtilities getTextFile() throws IOException
	{
		TextFilesUtilities text = new TextFilesUtilities(textFile);
		return text;
		
		//return new TextFilesUtilities(textFile);
	}
	
}