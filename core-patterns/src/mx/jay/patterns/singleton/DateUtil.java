package mx.jay.patterns.singleton;

public class DateUtil {
	
	private static volatile DateUtil instance;

	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		
		if (instance == null) {
			
			synchronized(DateUtil.class) {
				
				//This is a double check
				if (instance == null) {
					
					instance = new DateUtil();
				}
			}
		}
		
		return instance;
	}
}
