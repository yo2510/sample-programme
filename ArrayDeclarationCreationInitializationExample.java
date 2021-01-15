
public class ArrayDeclarationCreationInitializationExample {

	public static void main(String[] args) {
		System.out.println("1st way");
		String[] str;
		str = new String[3];
		str[0]= "Yogesh";
		str[1]= "Deepali";
		str[2]= "Adyansh";
		
		System.out.println("2st way");
		String[] str1 = new String[3];	
		str1[0]= "Yogesh";
		str1[1]= "Deepali";
		str1[2]= "Adyansh";
		
		System.out.println("3st way");
		String[] str2 = new String[] {"Yogesh", "Deepali", "Adyansh"};
		
		System.out.println("4st way");
		String[] str3 = {"Yogesh", "Deepali", "Adyansh"};		
		
		ArrayDeclarationCreationInitializationExample a = new ArrayDeclarationCreationInitializationExample();
		
		System.out.println("4st way annonymus array");
		a.annonymusArray(new String[] {"Yogesh", "Deepali", "Adyansh"});
	}
	
	public void annonymusArray(String[] str) {
		
	}

}
