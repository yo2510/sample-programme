import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionApiGetMthodMetadata {

	public static void main(String[] args) {
		try {
			Class r = Class.forName("PrivateClass");
			Method[] method = r.getDeclaredMethods();
			for(Method m : method) {
				System.out.println();
				System.out.println("name ["+m.getName()+"] return type ["+m.getReturnType()+"]");
				
				int i = m.getModifiers();
				System.out.println("access modifier ["+Modifier.toString(i)+"]");
				Class[] paramType = m.getParameterTypes();
				for( Class p : paramType ) {
					System.out.println("parameter type ["+ p.getName()+"]");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
