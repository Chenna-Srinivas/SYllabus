package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UserLaptop {
public static void main(String[] args) {
	ArrayList <Laptop> al=new ArrayList<Laptop>();
	al.add(new Laptop("hp", 55000, 8, "ryzen"));
	al.add(new Laptop("dell", 80000, 16, "intel"));
	al.add(new Laptop("asus", 70000, 16, "ryzen"));
	al.add(new Laptop("enovo", 45000, 12, "ryzen"));
	al.add(new Laptop("samsung", 75000, 10, "intel"));
	
	
	double avg,sum=0;
	for (int i = 0; i < al.size(); i++) {
		sum=sum+al.get(i).ram;
	}
	avg=sum/al.size();
	System.out.println(">>>>TASK -- 1<<<<");
	System.out.println("Average Ram Size is "+ avg);
	System.out.println(">>>>TASK -- 2<<<<");
	ArrayList al2 = new ArrayList();
	
	for (int j = 0; j < al.size(); j++) {
		if (al.get(j).ram>avg) {
		al2.add(al.get(j));	
		}
	}
	System.out.println(al2);
	
	System.out.println(">>>>TASK -- 3<<<<");
	ArrayList<Laptop> al3 = new ArrayList<Laptop>();
	for (int i = 0; i < al.size(); i++) 
	{
		
	if (al.get(i).name.charAt(0)== 'a'|| al.get(i).name.charAt(0)== 'e'|| al.get(i).name.charAt(0)== 'i'|| al.get(i).name.charAt(0)== 'o'|| al.get(i).name.charAt(0)== 'u') {
	al3.add(al.get(i));	
	}	
	}
System.out.println(al3);

System.out.println(">>>>TASK -- 4<<<<");

Collections.sort(al3);
System.out.println(al3);
}

}
