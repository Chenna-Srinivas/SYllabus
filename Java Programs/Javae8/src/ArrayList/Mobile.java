package ArrayList;

public class Mobile implements Comparable<Mobile> {

	String Name;
	double price;
	double Ram;
	double storage;
	double processor;
	public Mobile(String name, double price, double ram, double storage, double processor) {
		super();
		Name = name;
		this.price = price;
		this.Ram = ram;
		this.storage = storage;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Mobile [Name=" + Name + ", price=" + price + ", Ram=" + Ram + ", storage=" + storage + ", processor="
				+ processor + "]\n";
	}
	@Override
	public int compareTo(Mobile o) {
		if (this.storage>o.storage) {
			return -1;
		
		}
		if (this.storage<o.storage) {
			return 1;
		}
		return 0;
	}
	
}
