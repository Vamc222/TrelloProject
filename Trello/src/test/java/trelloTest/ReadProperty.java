package trelloTest;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	//Read the values from properties file
		public static String readValue(String strparameter) throws IOException
		{
			String propertyvalue="ABC";
			File file = new File("./Application.properties");

			FileInputStream fileInput = null;
			
			try {
			fileInput = new FileInputStream(file);
			Properties p = new Properties();
			p.load(fileInput);
			String propertyvalue1 = p.getProperty(strparameter);
			fileInput.close();
			propertyvalue=propertyvalue1;
			}
			catch(IOException e)
			{
			    e.printStackTrace();
			}
			
			return(propertyvalue);
		}
}
