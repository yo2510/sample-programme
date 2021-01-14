import java.util.ArrayList;
import java.util.List;

class Customer implements Cloneable{
	private List<String> custList;
	
	public Customer() {
		custList = new ArrayList<String>();
	}
	public Customer(List<String> custList) {
		this.custList = custList;
	}
	public List<String> getCustList() {
		return custList;
	}

	public void setCustList(List<String> custList) {
		this.custList = custList;
	}

	public void loadData() {
		custList.add("name1");
		custList.add("name2");
		custList.add("name3");
	}
	@Override 
	protected Object clone() {
		List<String> temp = new ArrayList<String>();
		for(String s : this.getCustList()) {
			temp.add(s);
		}
		return new Customer(temp);
	}
	
}
public class PrototypeClassExample extends Customer{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Customer c = new Customer();
		c.loadData();
		Customer c1 = (Customer) c.clone();
		Customer c2 = (Customer) c.clone();
		List<String> c1List = c1.getCustList();
		c1List.add("name4");
		System.out.println("c "+c.getCustList().size());
		System.out.println("c1 "+c1List.size());
	}
}
