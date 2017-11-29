package com.ramesh.Pojo;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.utilites.ExcelReader;
import com.rameshsoft.utilites.PropertiesReusabilites;

public class POJO {
	private static ExcelReader er;
	private static PropertiesReusabilites pr;
	
	public static  PropertiesReusabilites getPR(String prFilePath) throws IOException
	{
		
		 pr = new PropertiesReusabilites(prFilePath);
		return pr;
	}

	public static ExcelReader getER(String erFilePath) throws IOException, EncryptedDocumentException, InvalidFormatException
	{
		 er = new ExcelReader(erFilePath);
		return er;
	}
}
