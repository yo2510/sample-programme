
public class StringInternMethodExample {

	public static void main(String[] args) {
		String s1 = "Yogesh";
		String s2 = "Deepali";
		String s3 = s1.intern();		
		String s4 = new String("Adyansh");
		String s5 = s4.intern();
		String s6 = "Adyansh";
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println("s4["+s4.hashCode()+"] s5["+s5.hashCode()+"]");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s6));
		System.out.println("s6["+s6.hashCode()+"] s5["+s5.hashCode()+"]");
		System.out.println(s5 == s6);

	}

}
