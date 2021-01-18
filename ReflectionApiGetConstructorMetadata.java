import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectionApiGetConstructorMetadata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = PrivateClass.class;
		
		Constructor[] cons = c.getConstructors();
		for(Constructor c1 : cons) {
			System.out.println("name ["+c1.getName()+"]");
			int i = c1.getModifiers();
			System.out.println("modifier ["+Modifier.toString(i)+"]");
			Class[] paramType = c1.getParameterTypes();
			for(Class c3 : paramType) {
				System.out.println("param type ["+c3.getName()+"]");
			}
			Class[] c4 = c1.getExceptionTypes();
			for(Class c5 : c4) {
				System.out.println("exception type ["+c5.getName()+"]");
			}
		}
	}

}
