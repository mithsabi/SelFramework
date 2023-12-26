package Config;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop=new Properties();
     static String path=System.getProperty("user.dir");

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println(getBrowsername());
		System.out.println(getURL());
		setStatus("pass");
		
		}
	public static String getBrowsername() throws IOException
	{
      
       FileInputStream input=new  FileInputStream(path+"/src/test/java/Config/config.properties");
       prop.load(input);
      String brs= prop.getProperty("browser");
      return brs;
	}
	public static String getURL() throws IOException
	{
		FileInputStream input=new  FileInputStream(path+"/src/test/java/Config/config.properties");
	       prop.load(input);
       String url=prop.getProperty("URL");
       return url;
       
	}
	public static void setStatus(String status) throws IOException
	
	{
		FileOutputStream output=new  FileOutputStream(path+"/src/test/java/Config/config.properties");
		prop.setProperty("status", status);
		prop.store(output, null);
	
	
	
}
}