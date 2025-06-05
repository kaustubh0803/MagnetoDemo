package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetUserCredentials {

	public static Properties PropertiesFileSetup() throws IOException {
		Properties prop=new Properties();
		String basePath=System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(basePath+"//src//main//java//resources//GlobalParameters.properties");
		prop.load(fis);
		return prop;
	}
	
	public String getPassword() throws IOException {
		return PropertiesFileSetup().getProperty("password");
	}
	
	public String getEmail() throws IOException {
		return PropertiesFileSetup().getProperty("emailstring")+System.currentTimeMillis()+PropertiesFileSetup().getProperty("emaildomain");
	}
	
	public String getFirstName() throws IOException {
		return PropertiesFileSetup().getProperty("firstname");
	}
	
	public String getLastName() throws IOException {
		return PropertiesFileSetup().getProperty("lastname");
	}
}
