package singleton_pattern;

public class VolatileDoubleCheckSingletonPattern {
	private static volatile VolatileDoubleCheckSingletonPattern instance;
	private VolatileDoubleCheckSingletonPattern() {
		
	}
	
	public static VolatileDoubleCheckSingletonPattern getInstnace() {
		if(instance == null) {
			synchronized(VolatileDoubleCheckSingletonPattern.class) {
				if(instance == null) {
					instance = new VolatileDoubleCheckSingletonPattern();
				}
			}
		}
		
		return instance;
	}
}
