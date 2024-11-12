package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UserBike {
public static void main(String[] args) {
	double sum=0,avg;
	
	ArrayList <Bike> al= new ArrayList<Bike>();
	al.add(new Bike("XL", 75000, 60));
	al.add(new Bike ("Ola", 200000, 50));
	al.add(new Bike ("Pulsar", 175000, 45));
	al.add(new Bike ("R15", 250000, 40));
	al.add(new Bike ("GT-650", 450000, 35));
	System.out.println(al);
	System.out.println();
	
	for (int i = 0; i < al.size(); i++) {
		sum=sum+al.get(i).price;
		
	}
	avg=sum/al.size();
	System.out.println("Average price is: " + avg);
	System.out.println();
	ArrayList <Bike>al2 = new ArrayList<Bike>();
	for (int i = 0; i < al.size(); i++) {
		if(al.get(i).price>avg) {
			al2.add(al.get(i));
		}
	}
	System.out.println(al2);
	
	
	System.out.println();
	//ArrayList al3 = new ArrayList();
	//al3.addAll(al2);
	//System.out.println(al3);
	for (int i = 0; i < al2.size(); i++) {
		System.out.println(al2.get(i).brand);

	}
	
}
}
