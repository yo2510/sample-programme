
public class WithoutLoopIteration {
	
	public void printWithoutLoop(int n) {
		System.out.print(" "+n);
		if(n > 0 ) {
			printWithoutLoop(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutLoopIteration w = new WithoutLoopIteration();
		w.printWithoutLoop(10);
	}

}
