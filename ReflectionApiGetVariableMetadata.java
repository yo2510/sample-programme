import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionApiGetVariableMetadata {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("AbstractClass");
			ReflectionApiGetClassMetadata r = new ReflectionApiGetClassMetadata();
			Field[] field1 = c.getFields();
			Field[] field2 = c.getDeclaredFields();
			int modifier = c.getModifiers();
			
			System.out.println("public variable");
			for(Field f : field1) {
				System.out.println(	"variable name ["+f.getName()+"] type ["+f.getType()+"] value ["+f.get(r)+"]");
			}
			
			System.out.println();
			System.out.println("private variable");
			for(Field f : field2) {
				System.out.println(	"variable name ["+f.getName()+"] type ["+f.getType()+"]");
			}
			System.out.println();
			System.out.print("modifer use for class..");
			System.out.println(Modifier.toString(modifier));
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
