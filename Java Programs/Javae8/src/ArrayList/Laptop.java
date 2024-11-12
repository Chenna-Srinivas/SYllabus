package ArrayList;

public class Laptop implements Comparable<Laptop> {
String name;
double price;
double ram;
String version;

public Laptop(String name, double price, double ram, String version) {
	super();
	this.name = name;
	this.price = price;
	this.ram = ram;
	this.version = version;
}
@Override
public String toString() {
	return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + ", version=" + version + "]\n";
}
@Override
public int compareTo(Laptop o) {
	if (this.ram>o.ram) {
		return 1;
	}
	if (this.ram<o.ram) {
		return -1;
	}
	return 0;
}


}
