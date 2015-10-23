/**
 * 
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
		logger.info("----------");
		logger.info("---------- Bootstrap:	SERVICES-APP STARTED SUCCESSFULLY ----------");
		logger.info("----------");

		logger.debug("Reading All System Configuration File ...");
		ConfigurationProperties.getInstance().getProperties();
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent context) {
		logger.info("----------");
		logger.info("---------- Bootstrap:	SERVICES-APP STOPPED ----------");
		logger.info("----------");

	}

}
