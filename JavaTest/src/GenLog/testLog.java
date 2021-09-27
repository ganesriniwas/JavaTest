package GenLog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class testLog {

	public static Logger lg = LogManager.getLogger(testLog.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lg.error("Log1");
	}

}
