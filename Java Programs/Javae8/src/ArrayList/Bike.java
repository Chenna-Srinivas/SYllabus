package ArrayList;

public class Bike {
	String brand;
	double price;
	double mil;
	

	public Bike(String brand, double price, double mil) {
		super();
		this.brand = brand;
		this.price = price;
		this.mil = mil;
	}

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bike [brand=" + brand + 
				", price=" + price + ","
						+ " mil=" + mil + "]\n";
	}

}
