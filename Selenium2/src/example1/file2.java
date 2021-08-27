package example1;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class file2 {

	static final Logger logger1 = Logger.getLogger(file2.class);

	public static void main(String[] args) {

DOMConfigurator.configure("src\\example1\\File.xml");
		
		logger1.debug("Example for debug msg");
		logger1.info("Example for info msg");
		logger1.warn("Example for warn msg");
		logger1.error("Example for error msg");
		logger1.fatal("Example for fatal msg");

		}

}
