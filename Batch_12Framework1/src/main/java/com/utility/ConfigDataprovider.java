package com.utility;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataprovider {
	Properties pro ;
	
	public ConfigDataprovider() throws Exception {
		
		String path="C:\\Users\\dell\\eclipse-workspace\\Batch_12Framework1\\config\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		pro = new Properties();
		
		pro.load(fis);	
		
	}
	
	public String getBaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
	}
	public String getBaseUrl_QA2() {
		return pro.getProperty("BaseUrl_QA2");
	}
}
