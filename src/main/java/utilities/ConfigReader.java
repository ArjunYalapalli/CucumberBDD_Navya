package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties getProperties()   {
		
		Properties prop = new Properties();
		
		try {
			
			FileInputStream file = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Documents\\Desktop\\New folder (2)\\Luma_Cucumber\\src\\test\\resource\\cucumberProperties\\prop.properties");
			// FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource\\cucumberProperties\\prop.properties");
			prop.load(file);
			
			
		} catch (Exception e) {

		}

	return prop;
}

}
