package singleton_pattern;

public class SyncronizedSingletonPattern {
	private static SyncronizedSingletonPattern instance;
	private SyncronizedSingletonPattern() {
		
	}
	
	public static synchronized SyncronizedSingletonPattern getInstance() {
		if(instance == null) {
			instance = new SyncronizedSingletonPattern();
		}
		
		return instance;
	}
}
