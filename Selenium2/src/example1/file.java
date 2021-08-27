package example1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class file {

	static final Logger logger1 = Logger.getLogger(file.class);

	public static void main(String[] args) {

PropertyConfigurator.configure("src\\example1\\File.properties");
		
		logger1.debug("Example for debug msg");
		logger1.info("Example for info msg");
		logger1.warn("Example for warn msg");
		logger1.error("Example for error msg");
		logger1.fatal("Example for fatal msg");

		}

}
