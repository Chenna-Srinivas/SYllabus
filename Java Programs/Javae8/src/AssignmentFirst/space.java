package AssignmentFirst;

import java.util.Iterator;

public class space {
public static void main(String[] args) {
	String s = "ee sala cup namdhe ";
	int space=0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)== ' ') {
			space++;
			
		}
	}
	System.out.println(space);
}
}
