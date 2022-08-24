package java.com.utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataprovider {
	
	
	
		Properties pro;
		
		public  ConfigDataprovider () throws Exception{
			
			String path= "C:\\Users\\dell\\eclipse-workspace\\batch12_framework\\Config\\config.propertiesfile";
			FileInputStream fis=new FileInputStream(path);
			pro  = new Properties();
			pro.load(fis);
			
		}
		
		
		public  String get_BaseUerlQA1() {
			return pro.getProperty("BaseUrl_QA1");
			
			
		}
		public  String get_BaseUerlQA2() {
			return pro.getProperty("BaseUrl_QA2");
		}
	}	


