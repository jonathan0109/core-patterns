package mx.jay.patterns.singleton;

public class DateUtil {
	
	private static DateUtil instance;

	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		
		synchronized(DateUtil.class) {
			
			if (instance == null) {
				
				instance = new DateUtil();
			}
		}
		
		return instance;
	}
}
