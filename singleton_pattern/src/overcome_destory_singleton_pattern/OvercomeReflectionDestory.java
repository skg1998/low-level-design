package overcome_destory_singleton_pattern;

import java.lang.reflect.Constructor;

class Singleton {
	private static Singleton instance;

	private Singleton() {
		 if (instance != null) {
		      throw new IllegalStateException("instance already created.");
		    }
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
}

public class OvercomeReflectionDestory {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = null;
		try {
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for(Constructor constructor: constructors) {
				constructor.setAccessible(true);
				instance2 = (Singleton)constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
	}
}
