package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class userMobile {
public static void main(String[] args) {
	ArrayList<Mobile> al= new ArrayList<Mobile>();
	al.add(new Mobile("Samsung", 120000, 16, 512, 888));
	al.add(new Mobile("Oppo", 42000, 12, 256, 660));
	al.add(new Mobile("Apple", 140000, 6, 256, 987));
	al.add(new Mobile("Realme", 36000, 24, 1000, 999));
	al.add(new Mobile("Iqoo", 22000, 8, 128, 656));
	al.add(new Mobile("Redmi", 16000, 6, 64, 512));
	al.add(new Mobile("Vivo", 12000, 4, 128, 650));
	
	System.out.println(">>>> Task --1<<<<");
	double hprice=0; String brand="";
	
	for (int i = 0; i < al.size(); i++) {
		if (al.get(i).price>hprice) {
			hprice=al.get(i).price;
			brand=al.get(i).Name;
		}
	}
	System.out.println(brand +" " + hprice);
	
	
	System.out.println(">>>> Task --2<<<<");
	double avg,sum=0;
	for (int i = 0; i < al.size(); i++) {
	sum=sum+al.get(i).price;	
	}
	avg=sum/al.size();
	System.out.println("Avg price of mobile is : " + avg);

	ArrayList <Mobile> al2 = new ArrayList<Mobile>();
	
	for (int i = 0; i < al.size(); i++) {
		if (al.get(i).price>avg) {
			if (al.get(i).Name.charAt(0)=='A' || al.get(i).Name.charAt(0)=='E' || al.get(i).Name.charAt(0)=='I' || al.get(i).Name.charAt(0)=='O' || al.get(i).Name.charAt(0)=='U' || al.get(i).Name.charAt(0)=='a' || al.get(i).Name.charAt(0)=='e' || al.get(i).Name.charAt(0)=='i' || al.get(i).Name.charAt(0)=='o' || al.get(i).Name.charAt(0)=='u' ) {
				al2.add(al.get(i));
				
			}
		}
	}
	System.out.println(al2);

	System.out.println(">>>> Task --3<<<<");

	Collections.sort(al);
	System.out.println(al);

}
	
	
}
