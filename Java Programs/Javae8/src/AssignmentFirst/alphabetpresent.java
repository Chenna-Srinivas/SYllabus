package AssignmentFirst;

public class alphabetpresent {
	
	public static void main(String[] args) {
		String s="java";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
			
		}
		System.out.println(count);
	}
	}

