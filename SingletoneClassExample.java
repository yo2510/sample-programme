class SingletoneClass implements Cloneable{
	private static SingletoneClass instance = null;
	private SingletoneClass() {}
	public static SingletoneClass getSingletoneInstance() {
		if(instance == null) {
			synchronized (SingletoneClass.class) {
				if(instance == null) {
					instance = new SingletoneClass();
				}
			}
		}
		System.out.println(instance.hashCode());
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class SingletoneClassExample {

	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			SingletoneClass s = SingletoneClass.getSingletoneInstance();
			System.out.println("... "+s.hashCode());
			i++;
		}
	}

}
