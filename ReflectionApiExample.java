import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class PrivateClass{
	private String name;
	private String id;
	public int sum;
	
	public PrivateClass() {}
	
	public PrivateClass(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getNamePrivateClass() {
		return name;
	}
	public void setNamePrivateClass(String name) {
		this.name = name;
	}
	public String getIdPrivateClass() {
		return id;
	}
	public void setIdPrivateClass(String id) {
		this.id = id;
	}
	
	private int sum() {
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	private int add(int num) {
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}

class PrivateObject {

  private String privateString = null;

  public PrivateObject(String privateString) {
    this.privateString = privateString;
  }
}

public class ReflectionApiExample {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, 
		IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		ReflectionApiExample r = new ReflectionApiExample();
		PrivateClass s = new PrivateClass("Yogesh","101");
		System.out.println("Name value of private field..."+s.getNamePrivateClass());
		System.out.println("************************************************************************************************");
		Class c = Class.forName("PrivateClass");
		System.out.println("Name of the class..."+c.getName());
		Field name = c.getDeclaredField("name");
		name.setAccessible(true);
		String val = (String) name.get(s);
		System.out.println("get val..."+val);
		name.set(s, "Adyansh");
		String val1 = (String) name.get(s);
		System.out.println("set val..."+val1);
		System.out.println("************************************************************************************************");
		Method m = c.getDeclaredMethod("sum", null);
		m.setAccessible(true);
		int sum = (int) m.invoke(s, null);
		System.out.println("summation..."+sum);
		System.out.println("************************************************************************************************");
		Class[] classArg = new Class[1];
		classArg[0] = int.class;
		Method m1 = c.getDeclaredMethod("add", classArg);
		m1.setAccessible(true);
		int add = (int) m1.invoke(s, 10);
		System.out.println("addition..."+add);
		System.out.println("************************************************************************************************");
		System.out.println("Package..."+c.getPackage());
		System.out.println("Interface..."+c.getInterfaces());
		System.out.println("Supper class..."+c.getSuperclass());
		System.out.println("modifer..."+c.getModifiers());
	}
}
