interface Right {
	public default void display() {
		System.out.println("right interface");
	}
}

interface Left {
	public default void display() {
		System.out.println("left interface");
	}
}

public class DefaultMethodImplementation implements Right, Left{

	public static void main(String[] args) {
		DefaultMethodImplementation d = new DefaultMethodImplementation();
		d.testDefault();
		d.display();
	}
	
	@Override
	public void display() {
		System.out.println("override display");
	}
	
	public void testDefault() {
		Right.super.display();
	}	
}
