import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsFIlterMapApi {

	static List<Employee> empList = new ArrayList<Employee>();
	public static void main(String[] args) {
		empList = Arrays.asList(
					new Employee(1, "abc", 10000),
					new Employee(2, "pqr", 20000),
					new Employee(3, "xyz", 30000));
		
		List<Employee> eList =  empList.stream().filter(l-> l.getSalary() > 20000).collect(Collectors.toList());
		System.out.println(eList);
		Map<Integer, Employee> eMap = empList.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
		Map<Integer, Long> eMap1 = empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
		System.out.println(eMap1);
	}

}

class Employee {
	private int id;
	private String name;
	private long salary;
	
	public Employee() {}
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EMployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}