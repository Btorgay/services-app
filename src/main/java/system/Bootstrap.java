/**
 * This file is controlling the startup process of the application after the server comes up status
 */
package system;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

/**
 * @author burak.torgay
 * 
 */
public class Bootstrap implements ServletContextListener {

	final static Logger logger = Logger.getLogger(Bootstrap.class);

	@Override
	public void contextInitialized(ServletContextEvent context) {

		logger.debug("Reading All System Configuration File ...");
		ConfigurationProperties.getInstance().getProperties();
		logger.debug("Reading process finished...");
		
		logger.info("----------");
		logger.info("---------- Bootstrap:	SERVICES-APP STARTED SUCCESSFULLY ----------");
		logger.info("----------");
	}

	@Override
	public void contextDestroyed(ServletContextEvent context) {
		logger.info("----------");
		logger.info("---------- Bootstrap:	SERVICES-APP STOPPED ----------");
		logger.info("----------");

	}

}
