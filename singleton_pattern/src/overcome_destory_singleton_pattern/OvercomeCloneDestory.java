package overcome_destory_singleton_pattern;

class ParentClass implements Cloneable{
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class LazySingletonPattern extends ParentClass{
	private static LazySingletonPattern instance;

	private LazySingletonPattern() {
		
	}
	
	public static LazySingletonPattern getInstance() {
		if(instance == null) {
			instance = new LazySingletonPattern();
		}
		
		return instance;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

public class OvercomeCloneDestory {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		LazySingletonPattern instance = LazySingletonPattern.getInstance();
		LazySingletonPattern instance2 = (LazySingletonPattern)instance.clone();
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
	}
}
