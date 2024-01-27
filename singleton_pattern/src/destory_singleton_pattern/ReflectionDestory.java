package destory_singleton_pattern;

import java.lang.reflect.Constructor;

import singleton_pattern.LazySingletonPattern;

public class ReflectionDestory {
	public static void main(String[] args) {
		LazySingletonPattern instance = LazySingletonPattern.getInstance();
		LazySingletonPattern instance2 = null;
		try {
			Constructor[] constructors = LazySingletonPattern.class.getDeclaredConstructors();
			for(Constructor constructor: constructors) {
				constructor.setAccessible(true);
				instance2 = (LazySingletonPattern)constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
	}
}
