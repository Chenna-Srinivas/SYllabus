package ArrayList;

import java.util.Collections;

public class Student implements Comparable<Student>{
String name;
double marks;
int id;
String course;
double salary;

public Student(String name, double marks, int id, String course, double salary) {
	super();
	this.name = name;
	this.marks = marks;
	this.id = id;
	this.course = course;
	this.salary = salary;
}

@Override
public String toString() {
	return "Student [name=" + name + ", marks=" + marks + ", id=" + id + ", course=" + course + ", salary=" + salary
			+ "]\n";
}

@Override
public int compareTo(Student o) {
	if (this.marks>o.marks) {
		return -1;
	}
	if (this.marks<o.marks) {
		return 1;
	}
	return 0;
}


}
