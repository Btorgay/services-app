/**
 * This java class is for reading all the system configuration variables from config.properties files.
 */
package system;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author burak.torgay
 *
 */
public class ConfigurationProperties {

	final static Logger logger = Logger.getLogger(Bootstrap.class);
	
	private static ConfigurationProperties configurationProperties;

	Properties prop = new Properties();
	InputStream input = null;
	
	public static ConfigurationProperties getInstance(){
		if(configurationProperties == null)
			configurationProperties = new ConfigurationProperties();
		return configurationProperties;
	}
	
	public void getProperties(){
		try {

			String filename = "system/config.properties";
			input = Bootstrap.class.getClassLoader().getResourceAsStream(filename);
			if (input == null) {
				logger.error("An error occured trying to find " + filename);
				return;
			}

			// load a properties file from class path, inside static method
			prop.load(input);

			// get the property value and print it out
			logger.debug("Application Name: " + prop.getProperty("Application.name"));

		} catch (IOException ex) {
			logger.error("Error occured while loading config.property file");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					logger.error("Error occured while closing config.property file");
				}
			}
		}
	}

}
