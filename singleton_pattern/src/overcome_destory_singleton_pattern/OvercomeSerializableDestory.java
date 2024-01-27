package overcome_destory_singleton_pattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EagerSingletonPattern implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static EagerSingletonPattern instance = new EagerSingletonPattern();
	private EagerSingletonPattern() {
		
	}
	
	public static EagerSingletonPattern getInstance() {
		return instance;
	}
	
	 protected Object readResolve() { 
		 return instance;
	}
}

public class OvercomeSerializableDestory {
	public static void main(String[] args) {
		try {
			EagerSingletonPattern instance = EagerSingletonPattern.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
			out.writeObject(instance);
			out.close();
			
			ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
			EagerSingletonPattern instance2 = (EagerSingletonPattern)in.readObject();
			in.close();
			
			System.out.println(instance.hashCode());
			System.out.println(instance2.hashCode());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
