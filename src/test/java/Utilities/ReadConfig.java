package Utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class ReadConfig{
	Properties properties;
	String path="config.properties";
	
	//constructor 
	public ReadConfig() {
		
		try {
			properties=new Properties();
			FileInputStream fis=new FileInputStream(path);
			properties.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public String GetBrowser() {
		String value=properties.getProperty("browser");
		
		if(value!=null) {
			return value;
		}
		else 
		throw new RuntimeException("url not specified in config file");
	}
	
	
}