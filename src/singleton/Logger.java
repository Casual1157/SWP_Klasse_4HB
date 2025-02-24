package singleton;

public class Logger {
	
	 private Logger() {}
	 
	 private static class LoggerHolder{
		 private final static Logger INSTANCE = new Logger();
	 }
	 
	 public static Logger getInstance() {
	     return LoggerHolder.INSTANCE;
	}
	 
	 public void logMessage(String message) {
		 System.out.println("[LOG:] " + message);
	 }
}
