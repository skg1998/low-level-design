package singleton_pattern;

public class DoubleCheckSingletonPattern {
	private static DoubleCheckSingletonPattern instance;
	private DoubleCheckSingletonPattern() {
		
	}
	
	public static DoubleCheckSingletonPattern getInstance() {
		if(instance == null) {
			synchronized(DoubleCheckSingletonPattern.class) {
				if(instance == null) {
					instance = new DoubleCheckSingletonPattern();
				}
			}
		}
		
		return instance;
	}
}
