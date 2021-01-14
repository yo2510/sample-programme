import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashCollisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		System.out.println("hashcode:: "+new Person(101, "Java").hashCode());
		System.out.println("hashcode:: "+new Person(102, ".Net").hashCode());
		System.out.println("hashcode:: "+new Person(103, "Java").hashCode());
		
		map.put(new Person(101, "Java"), 101);
		map.put(new Person(102, ".Net"), 102);
		map.put(new Person(103, ".Net"), 103);
		System.out.println(map.size());
		for( Map.Entry<Person, Integer> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey().getId()+" : "+entrySet.getValue());
		}
		System.out.println(map.size());
	}
	
}

class Person {
	private int id;
	private String name;
	
	public Person() {}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}