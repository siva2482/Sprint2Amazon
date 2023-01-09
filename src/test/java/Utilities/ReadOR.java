package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadOR {
	 public static FileInputStream fis;
	  public static Properties pro;
	  public static String getLocator(String key) {
		  
		  try
		  {
			  fis=new FileInputStream("C:\\Sprint2Amazon\\src\\test\\resources\\PropertyFiles\\Config.properties");
			  pro=new Properties();
			  pro.load(fis);
			  return pro.getProperty(key);
		  }
		  catch(Exception e)
			{
			e.printStackTrace();	
			}
		 return null;
	  }

}
