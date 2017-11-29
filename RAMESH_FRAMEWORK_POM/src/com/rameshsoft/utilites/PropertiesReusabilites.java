package com.rameshsoft.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReusabilites {
	String filepath;
	// File f;
	FileInputStream fip;
	FileOutputStream fop;
	Properties p;

	public PropertiesReusabilites(String filepath) throws IOException {
		this.filepath = filepath;
		// f= new File(filepath);
		fip = new FileInputStream(filepath);
		// fop= new FileOutputStream(f);
		p = new Properties();
		p.load(fip);

	}

	public String readProperty(String key) throws IOException {

		String value = p.getProperty(key);
		return value;
	}

	public void removeProperty(String key) {
		p.remove(key);

	}

	public void writProperty(String key, String value) throws IOException {
		p.setProperty(key, value);
		p.store(fop, "values entered");
		fop = new FileOutputStream(filepath);

	}

}
