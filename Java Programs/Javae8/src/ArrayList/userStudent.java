package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class userStudent {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student("Srinivas", 86, 415, "java", 28000));
	al.add(new Student("Sumanth", 84, 410, "manual", 32000));
	al.add(new Student("Uumaiya", 92, 411, "SQL", 38000));
	al.add(new Student("Sampath", 86, 431, "developer", 52000));
	al.add(new Student("ithya", 68, 418, "automation", 33000));
	al.add(new Student("Pavan", 72, 405, "pega", 29000));
	al.add(new Student("Ravi", 82, 420, "devops", 26000));
	
	double avg,sum=0;
	System.out.println(">>>> TASK -- 1<<<<");
	Collections.sort(al);
	System.out.println("Marks in Descending Order "+ al);
	System.out.println(">>>> TASK -- 2<<<<");
	for (int i = 0; i < al.size(); i++) {
		sum=sum+al.get(i).marks;
	}
	avg=sum/al.size();
	System.out.println("Average Marks is: " + avg);
	ArrayList<Student> al2 = new ArrayList<Student>();
	for (int i = 0; i < al.size(); i++) {
		if (al.get(i).marks>avg) {
			al2.add(al.get(i));
			
		}
	}
	System.out.println(al2);
	System.out.println(">>>> TASK -- 3<<<<");
	ArrayList <Student> al3=new ArrayList<Student>();
	for (int i = 0; i < al.size(); i++) {
		if (al.get(i).name.charAt(0)!= 'A' && al.get(i).name.charAt(0)!= 'E' && al.get(i).name.charAt(0)!= 'I' && al.get(i).name.charAt(0)!= 'O' && al.get(i).name.charAt(0)!= 'U' && al.get(i).name.charAt(0)!= 'a' && al.get(i).name.charAt(0)!= 'e' && al.get(i).name.charAt(0)!= 'i' && al.get(i).name.charAt(0)!= 'o' && al.get(i).name.charAt(0)!= 'u' ) {
			al3.add(al.get(i));
		}
	}
System.out.println(al3);


}
}
