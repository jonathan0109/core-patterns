package mx.jay.patterns.singleton;

public class DateUtil {
	
	private static DateUtil instance = new DateUtil();

	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		
		return instance;
	}
}
