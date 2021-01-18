import java.io.Serializable;
import java.lang.reflect.Modifier;

abstract class AbstractClass implements Serializable, Cloneable{
	private String name;
	private String id;
	public int phone;
	public String address;
}

public class ReflectionApiGetClassMetadata extends AbstractClass{

	public static void main(String[] args) {
		try {
			Class c = Class.forName("AbstractClass");
			System.out.println("Class name : ");
			System.out.println( c.getName());
			
			System.out.println("Super class name : ");
			System.out.println( c.getSuperclass());
			
			System.out.println("IMplemented interface name : ");
			Class[] intefaceList = c.getInterfaces();
			for(Class c1 : intefaceList ) {
				System.out.println( c1.getName());
			}
			
			System.out.println( "Modifier name : ");
			int i = c.getModifiers();			
			System.out.println( Modifier.toString(i));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
