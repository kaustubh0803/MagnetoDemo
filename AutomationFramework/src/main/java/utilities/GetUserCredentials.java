package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetUserCredentials {

	private static String emailvalue;
	
	public static Properties PropertiesFileSetup() throws IOException {
		Properties prop=new Properties();
		String basePath=System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(basePath+"//src//main//java//resources//GlobalParameters.properties");
		prop.load(fis);
		return prop;
	}
	
	public static String getPassword() throws IOException {
		return PropertiesFileSetup().getProperty("password");
	}
	
	public static String generateEmail() throws IOException {
		emailvalue= PropertiesFileSetup().getProperty("emailstring")+System.currentTimeMillis()+PropertiesFileSetup().getProperty("emaildomain");
		return emailvalue;
	}
	 
	public static String getEmail() {
		return emailvalue;
	}
	
	public static String getFirstName() throws IOException {
		return PropertiesFileSetup().getProperty("firstname");
	}
	
	public static String getLastName() throws IOException {
		return PropertiesFileSetup().getProperty("lastname");
	}
}
