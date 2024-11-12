package AssignmentFirst;

public class even {
	public static void main(String[] args) {
		String s="viratkohli";
		String temp="";
		for (int i =0;i<s.length();i++) {
			if(i%2==0) {
				temp=temp+(char)(s.charAt(i)-32);
			}
			else {
				temp=temp+s.charAt(i);
			}
			
		}
		System.out.println(temp);
	}
	}
